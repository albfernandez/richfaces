/*
 * JBoss, Home of Professional Open Source
 * Copyright , Red Hat, Inc. and individual contributors
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
package org.richfaces.component;

import javax.annotation.Generated;

/**
 * <p>
 * The &lt;a4j:region&gt; component specifies a part of the JSF component tree to be processed on the server.
 * The region causes all the a4j and rich Ajax controls to execute: decoding, validating, and updating the model.
 * The region causes these components to execute even if not explicitly declared. As such, processing areas can more
 * easily be marked using a declarative approach.
 * </p>
 * <p>
 * Regions can be nested, in which case only the parent region of the component initiating the request will be processed.
 * </p>
 *
 * @author Nick Belaevski
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIRegion extends AbstractRegion
        implements AjaxContainer, MetaComponentResolver {

    public static final String COMPONENT_TYPE = "org.richfaces.Region";

    public static final String COMPONENT_FAMILY = "org.richfaces.AjaxContainer";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }


    protected enum Properties {


    }


}
