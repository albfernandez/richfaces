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
 * <p>The &lt;rich:jQuery&gt; component applies styles and custom behavior to both JSF (JavaServer Faces) objects and
 * regular DOM (Document Object Model) objects. It uses the jQuery JavaScript framework to add functionality to web
 * applications.</p>
 *
 * <p>This component is for use as a facelet tag.  See the &lt;rich:jQuery&gt; EL function for access to the jQuery library
 * via EL.</p>
 *
 * @author nick
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIJQuery extends AbstractJQuery {

    public static final String COMPONENT_TYPE = "org.richfaces.JQuery";

    public static final String COMPONENT_FAMILY = "org.richfaces.JQuery";

    public UIJQuery() {
        super();
        setRendererType("org.richfaces.JQueryRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public JQueryAttachType getAttachType() {
        JQueryAttachType value = (JQueryAttachType) getStateHelper().eval(Properties.attachType);
        return value;
    }

    public void setAttachType(JQueryAttachType attachType) {
        getStateHelper().put(Properties.attachType, attachType);
    }

    public String getEvent() {
        String value = (String) getStateHelper().eval(Properties.event);
        return value;
    }

    public void setEvent(String event) {
        getStateHelper().put(Properties.event, event);
    }

    public String getName() {
        String value = (String) getStateHelper().eval(Properties.name);
        return value;
    }

    public void setName(String name) {
        getStateHelper().put(Properties.name, name);
    }

    public String getQuery() {
        String value = (String) getStateHelper().eval(Properties.query);
        return value;
    }

    public void setQuery(String query) {
        getStateHelper().put(Properties.query, query);
    }

    public String getSelector() {
        String value = (String) getStateHelper().eval(Properties.selector);
        return value;
    }

    public void setSelector(String selector) {
        getStateHelper().put(Properties.selector, selector);
    }

    public JQueryTiming getTiming() {
        JQueryTiming value = (JQueryTiming) getStateHelper().eval(Properties.timing);
        return value;
    }

    public void setTiming(JQueryTiming timing) {
        getStateHelper().put(Properties.timing, timing);
    }

    protected enum Properties {
        attachType,
        event,
        name,
        query,
        selector,
        timing

    }


}
