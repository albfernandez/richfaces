package org.richfaces.view.facelets.html;

import org.richfaces.view.facelets.RowKeyConverterRule;

import jakarta.faces.view.facelets.ComponentConfig;
import jakarta.faces.view.facelets.ComponentHandler;
import jakarta.faces.view.facelets.MetaRuleset;

/**
 * User: Gleb Galkin Date: 11.03.11
 */
public class RepeatHandler extends ComponentHandler {
    public RepeatHandler(ComponentConfig config) {
        super(config);
    }

    protected MetaRuleset createMetaRuleset(Class type) {
        MetaRuleset metaRuleset = super.createMetaRuleset(type);
        metaRuleset.addRule(RowKeyConverterRule.INSTANCE);
        return metaRuleset;
    }
}
