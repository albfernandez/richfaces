/**
 * License Agreement.
 * <p>
 * Rich Faces - Natural Ajax for Java Server Faces (JSF)
 * <p>
 * Copyright (C) 2007 Exadel, Inc.
 * <p>
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1 as published by the Free Software Foundation.
 * <p>
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
 */
package org.richfaces.view.facelets.html;

import jakarta.faces.view.facelets.ComponentConfig;
import jakarta.faces.view.facelets.ComponentHandler;
import jakarta.faces.view.facelets.FaceletContext;
import jakarta.faces.view.facelets.MetaRule;
import jakarta.faces.view.facelets.MetaRuleset;
import jakarta.faces.view.facelets.Metadata;
import jakarta.faces.view.facelets.MetadataTarget;
import jakarta.faces.view.facelets.TagAttribute;
import org.richfaces.component.AbstractMediaOutput;
import org.richfaces.view.facelets.MethodMetadata;

import java.io.OutputStream;

/**
 * @author shura (latest modification by $Author: alexsmirnov $)
 * @version $Revision: 1.1.2.1 $ $Date: 2007/02/01 15:31:22 $
 *
 */
public class MediaOutputHandler extends ComponentHandler {
    private static final MediaOutputHandlerMetaRule META_RULE = new MediaOutputHandlerMetaRule();

    public MediaOutputHandler(ComponentConfig config) {
        super(config);
    }

    protected MetaRuleset createMetaRuleset(Class type) {
        MetaRuleset m = super.createMetaRuleset(type);
        m.addRule(META_RULE);
        return m;
    }

    static class MediaOutputHandlerMetaRule extends MetaRule {
        public Metadata applyRule(String name, TagAttribute attribute, MetadataTarget meta) {
            if (meta.isTargetInstanceOf(AbstractMediaOutput.class)) {
                if ("createContent".equals(name)) {
                    return new MethodMetadata(attribute, OutputStream.class, Object.class) {
                        public void applyMetadata(FaceletContext ctx, Object instance) {
                            ((AbstractMediaOutput) instance).setCreateContent(getMethodExpression(ctx));
                        }
                    };
                }
            }
            return null;
        }
    }
}
