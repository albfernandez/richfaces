/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.richfaces.view.facelets;

import jakarta.el.ValueExpression;
import jakarta.faces.component.UIComponent;
import jakarta.faces.component.ValueHolder;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.view.facelets.ComponentConfig;
import jakarta.faces.view.facelets.ComponentHandler;
import jakarta.faces.view.facelets.FaceletContext;
import jakarta.faces.view.facelets.MetaRule;
import jakarta.faces.view.facelets.MetaRuleset;
import jakarta.faces.view.facelets.Metadata;
import jakarta.faces.view.facelets.MetadataTarget;
import jakarta.faces.view.facelets.TagAttribute;

import org.richfaces.component.attribute.AutocompleteProps;

/**
 * @author Nick Belaevski
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
// TODO nick - this should be generated by CDK
public class AutocompleteHandler extends ComponentHandler {
    private static final MetaRule AUTOCOMPLETE_METHOD_META_RULE = new MetaRule() {
        @Override
        public Metadata applyRule(String name, TagAttribute attribute, MetadataTarget meta) {
            if (meta.isTargetInstanceOf(AutocompleteProps.class)) {
                if ("autocompleteMethod".equals(name)) {

                    // workaround for RF-11469
                    final MethodMetadata oneParameterMetadata = new MethodMetadata(attribute, String.class) {
                        public void applyMetadata(FaceletContext ctx, Object instance) {
                            ((AutocompleteProps) instance).setAutocompleteMethodWithOneParameter(getMethodExpression(ctx));
                        }
                    };

                    return new MethodMetadata(attribute, FacesContext.class, UIComponent.class, String.class) {
                        public void applyMetadata(FaceletContext ctx, Object instance) {
                            ((AutocompleteProps) instance).setAutocompleteMethod(getMethodExpression(ctx));
                            ((AutocompleteProps) instance).setAutocompleteMethodWithOneParameter(oneParameterMetadata.getMethodExpression(ctx));
                        }
                    };
                }

                if ("converter".equals(name)) {
                    return new ConverterMetadata(attribute) {
                        public void applyMetadata(FaceletContext ctx, Object instance) {
                            ((ValueHolder) instance).setConverter(this.getConverter(ctx,
                                this.getAttr().getValueExpression(ctx, Converter.class)));
                        }
                    };
                }
            }

            return null;
        }
    };

    public AutocompleteHandler(ComponentConfig config) {
        super(config);
    }

    @Override
    protected MetaRuleset createMetaRuleset(Class type) {
        MetaRuleset metaRuleset = super.createMetaRuleset(type);
        metaRuleset.addRule(AUTOCOMPLETE_METHOD_META_RULE);
        return metaRuleset;
    }

    abstract static class ConverterMetadata extends Metadata {
        private final TagAttribute attr;

        public ConverterMetadata(TagAttribute attr) {
            this.attr = attr;
        }

        public TagAttribute getAttr() {
            return attr;
        }

        public Converter getConverter(FaceletContext ctx, ValueExpression converter) {
            ValueExpression ve = null;
            Converter c = null;
            if (converter != null) {
                ve = converter;
                try {
                    c = (Converter) ve.getValue(ctx);
                } catch (Exception e) {
                    // oka
                }
            }
            if (c == null) {
                c = this.createConverter(ctx);
            }
            if (c == null) {
                // throw new TagException(this.getTag(), "No Converter was
                // created");
            }
            return c;
        }

        private String getConverterId(FaceletContext ctx) {
            return this.getAttr().getValue(ctx);
        }

        private Converter createConverter(FaceletContext ctx) {
            return ctx.getFacesContext().getApplication().createConverter(getConverterId(ctx));
        }
    }
}
