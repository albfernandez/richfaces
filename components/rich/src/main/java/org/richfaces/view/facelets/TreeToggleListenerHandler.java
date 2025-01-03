package org.richfaces.view.facelets;

import org.richfaces.event.TreeToggleEvent;
import org.richfaces.event.TreeToggleListener;
import org.richfaces.event.TreeToggleSource;

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

public class TreeToggleListenerHandler extends TagHandler {

    private TagAttribute binding;
    private String listenerType;
    private TagAttribute listenerMethod;

    public TreeToggleListenerHandler(TagConfig config) {
        super(config);

        this.binding = this.getAttribute("binding");

        TagAttribute type = this.getAttribute("type");
        if (type != null) {
            if (!type.isLiteral()) {
                throw new TagAttributeException(type, "Must be a literal class name of type TreeToggleListener");
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
            if (!(parent instanceof TreeToggleSource)) {
                throw new TagException(this.tag, "Parent is not of type TreeToggleSource, type is: " + parent);
            }

            TreeToggleSource as = (TreeToggleSource) parent;

            if (this.listenerMethod != null) {
                MethodExpression listenerMethodExpression =
                        this.listenerMethod.getMethodExpression(ctx, Void.TYPE, new Class<?>[]{TreeToggleEvent.class});

                as.addTreeToggleListener(new MethodExpressionListener(listenerMethodExpression));
            } else {
                ValueExpression b = null;
                if (this.binding != null) {
                    b = this.binding.getValueExpression(ctx, TreeToggleListener.class);
                }
                TreeToggleListener listener = new LazyListener(this.listenerType, b);
                as.addTreeToggleListener(listener);
            }
        }
    }

    @SuppressWarnings("serial")
    public static final class LazyListener implements TreeToggleListener, Serializable {

        private final String type;

        private final ValueExpression binding;

        public LazyListener(String type, ValueExpression binding) {
            this.type = type;
            this.binding = binding;
        }

        public void processTreeToggle(TreeToggleEvent event) throws AbortProcessingException {
            TreeToggleListener instance = null;
            FacesContext faces = FacesContext.getCurrentInstance();
            if (faces == null) {
                return;
            }

            if (this.binding != null) {
                instance = (TreeToggleListener) binding.getValue(faces.getELContext());
            }

            if (instance == null && this.type != null) {
                try {
                    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
                    if (null == classLoader) {
                        classLoader = TreeToggleListener.class.getClassLoader();
                    }
                    instance = classLoader.loadClass(this.type).asSubclass(TreeToggleListener.class).newInstance();
                } catch (Exception e) {
                    throw new AbortProcessingException("Couldn't lazily instantiate TreeToggleListener", e);
                }

                if (this.binding != null) {
                    binding.setValue(faces.getELContext(), instance);
                }
            }

            if (instance != null) {
                instance.processTreeToggle(event);
            }
        }
    }

    @SuppressWarnings("serial")
    public static final class MethodExpressionListener implements TreeToggleListener, Serializable {

        private MethodExpression methodExpression;

        public MethodExpressionListener(MethodExpression methodExpression) {
            super();
            this.methodExpression = methodExpression;
        }

        public void processTreeToggle(TreeToggleEvent actionEvent) throws AbortProcessingException {
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
