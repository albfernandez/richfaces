package org.richfaces.taglib;

import jakarta.faces.view.facelets.ComponentConfig;
import jakarta.faces.view.facelets.ComponentHandler;
import jakarta.faces.view.facelets.MetaRuleset;

import org.richfaces.view.facelets.RowKeyConverterRule;

/**
 * User: Gleb Galkin Date: 11.03.11
 */
public class ListHandler extends ComponentHandler {
    public ListHandler(ComponentConfig config) {
        super(config);
    }

    protected MetaRuleset createMetaRuleset(Class type) {
        MetaRuleset metaRuleset = super.createMetaRuleset(type);
        metaRuleset.addRule(RowKeyConverterRule.INSTANCE);
        return metaRuleset;
    }
}