package org.richfaces.view.facelets;

import jakarta.faces.view.facelets.FaceletContext;
import jakarta.faces.view.facelets.Metadata;
import jakarta.faces.view.facelets.TagAttribute;

import org.richfaces.event.MethodExpressionTreeToggleListener;
import org.richfaces.event.TreeToggleEvent;
import org.richfaces.event.TreeToggleSource;

/**
 * @author Nick Belaevski
 *
 */
final class TreeToggleListenerExpressionMetadata extends Metadata {
    private static final Class<?>[] SIGNATURE = new Class[] { TreeToggleEvent.class };
    private final TagAttribute attr;

    TreeToggleListenerExpressionMetadata(TagAttribute attr) {
        this.attr = attr;
    }

    @Override
    public void applyMetadata(FaceletContext ctx, Object instance) {
        ((TreeToggleSource) instance).addTreeToggleListener(new MethodExpressionTreeToggleListener(this.attr
            .getMethodExpression(ctx, null, SIGNATURE)));
    }
}