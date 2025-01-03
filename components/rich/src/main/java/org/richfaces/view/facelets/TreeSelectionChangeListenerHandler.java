package org.richfaces.view.facelets;

import org.richfaces.event.TreeSelectionChangeEvent;
import org.richfaces.event.TreeSelectionChangeListener;
import org.richfaces.event.TreeSelectionChangeSource;

import jakarta.el.ELContext;
import jakarta.el.MethodExpression;
import jakarta.el.ValueExpression;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.view.facelets.ComponentHandler;
import jakarta.faces.view.facelets.FaceletContext;
import jakarta.faces.view.facelets.TagAttribute;
import jakarta.faces.view.facelets.TagAttributeException;
import jakarta.faces.view.facelets.TagConfig;
import jakarta.faces.view.facelets.TagException;
import jakarta.faces.view.facelets.TagHandler;
import java.io.IOException;
import java.io.Serializable;

public class TreeSelectionChangeListenerHandler extends TagHandler {

    private TagAttribute binding;
    private String listenerType;
    private TagAttribute listenerMethod;

    public TreeSelectionChangeListenerHandler(TagConfig config) {
        super(config);

        this.binding = this.getAttribute("binding");

        TagAttribute type = this.getAttribute("type");
        if (type != null) {
            if (!type.isLiteral()) {
                throw new TagAttributeException(type, "Must be a literal class name of type TreeSelectionChangeListener");
            } else {
                // test it out
            }

            this.listenerType = type.getValue();
        } else {
            this.listenerType = null;
        }

        this.listenerMethod = this.getAttribute("listener");

        if (this.listenerMethod != null && this.binding != null) {
            throw new TagException(this.tag, "Attributes 'listener' and 'binding' cannot be used simultaneously");
        }

        if (this.listenerMethod != null && this.listenerType != null) {
            throw new TagException(this.tag, "Attributes 'listener' and 'type' cannot be used simultaneously");
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see javax.faces.view.facelets.FaceletHandler#apply(javax.faces.view.facelets.FaceletContext,
     * javax.faces.component.UIComponent)
     */
    public void apply(FaceletContext ctx, UIComponent parent) throws IOException {
        if (null != parent && ComponentHandler.isNew(parent)) {
            if (!(parent instanceof TreeSelectionChangeSource)) {
                throw new TagException(this.tag, "Parent is not of type TreeSelectionChangeSource, type is: " + parent);
            }

            TreeSelectionChangeSource as = (TreeSelectionChangeSource) parent;

            if (this.listenerMethod != null) {
                MethodExpression listenerMethodExpression =
                        this.listenerMethod.getMethodExpression(ctx, Void.TYPE, new Class<?>[]{TreeSelectionChangeEvent.class});

                as.addTreeSelectionChangeListener(new MethodExpressionListener(listenerMethodExpression));
            } else {
                ValueExpression b = null;
                if (this.binding != null) {
                    b = this.binding.getValueExpression(ctx, TreeSelectionChangeListener.class);
                }
                TreeSelectionChangeListener listener = new LazyListener(this.listenerType, b);
                as.addTreeSelectionChangeListener(listener);
            }
        }
    }

    @SuppressWarnings("serial")
    public static final class LazyListener implements TreeSelectionChangeListener, Serializable {

        private final String type;

        private final ValueExpression binding;

        public LazyListener(String type, ValueExpression binding) {
            this.type = type;
            this.binding = binding;
        }

        public void processTreeSelectionChange(TreeSelectionChangeEvent event) throws AbortProcessingException {
            TreeSelectionChangeListener instance = null;
            FacesContext faces = FacesContext.getCurrentInstance();
            if (faces == null) {
                return;
            }

            if (this.binding != null) {
                instance = (TreeSelectionChangeListener) binding.getValue(faces.getELContext());
            }

            if (instance == null && this.type != null) {
                try {
                    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
                    if (null == classLoader) {
                        classLoader = TreeSelectionChangeListener.class.getClassLoader();
                    }
                    instance = classLoader.loadClass(this.type).asSubclass(TreeSelectionChangeListener.class).newInstance();
                } catch (Exception e) {
                    throw new AbortProcessingException("Couldn't lazily instantiate TreeSelectionChangeListener", e);
                }

                if (this.binding != null) {
                    binding.setValue(faces.getELContext(), instance);
                }
            }

            if (instance != null) {
                instance.processTreeSelectionChange(event);
            }
        }
    }

    @SuppressWarnings("serial")
    public static final class MethodExpressionListener implements TreeSelectionChangeListener, Serializable {

        private MethodExpression methodExpression;

        public MethodExpressionListener(MethodExpression methodExpression) {
            super();
            this.methodExpression = methodExpression;
        }

        public void processTreeSelectionChange(TreeSelectionChangeEvent actionEvent) throws AbortProcessingException {
            if (actionEvent == null) {
                throw new NullPointerException();
            }
            FacesContext context = FacesContext.getCurrentInstance();
            ELContext elContext = context.getELContext();
            try {
                methodExpression.invoke(elContext, new Object[]{actionEvent});
            } catch (Exception e) {
                new AbortProcessingException(e);
            }
        }
    }

}
