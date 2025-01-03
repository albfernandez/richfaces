/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat, Inc. and individual contributors
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
package org.richfaces.renderkit.html;

import org.richfaces.application.CommonComponentsConfiguration;
import org.richfaces.component.QueueRegistry;
import org.richfaces.log.Logger;
import org.richfaces.log.RichfacesLogger;

import jakarta.faces.application.Application;
import jakarta.faces.application.ResourceDependencies;
import jakarta.faces.application.ResourceDependency;
import jakarta.faces.component.UIComponent;
import jakarta.faces.component.UIOutput;
import jakarta.faces.context.FacesContext;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.ComponentSystemEvent;
import jakarta.faces.event.ComponentSystemEventListener;
import jakarta.faces.event.ListenerFor;
import jakarta.faces.event.ListenersFor;
import jakarta.faces.event.PostAddToViewEvent;
import jakarta.faces.event.PreRemoveFromViewEvent;
import jakarta.faces.render.Renderer;
import java.util.List;

import static org.richfaces.application.configuration.ConfigurationServiceHelper.getBooleanConfigurationValue;

/**
 * @author Nick Belaevski Base class for rendering Queue
 */
@ResourceDependencies({
        @ResourceDependency(library = "javax.faces", name = "jsf.js"),
        @ResourceDependency(library = "org.richfaces", name = "jquery.js"),
        @ResourceDependency(library = "org.richfaces", name = "richfaces.js"),
        @ResourceDependency(library = "org.richfaces", name = "richfaces-queue.reslib")
})
@ListenersFor({@ListenerFor(systemEventClass = PostAddToViewEvent.class),
        @ListenerFor(systemEventClass = PreRemoveFromViewEvent.class)})
public abstract class QueueRendererBase extends Renderer implements ComponentSystemEventListener {
    protected static final String QUEUE_ID_ATTRIBBUTE = "queueId";
    protected static final String NAME_ATTRIBBUTE = "name";
    protected static final Logger LOGGER = RichfacesLogger.COMPONENTS.getLogger();
    private static final String QUEUE_RESOURCE_COMPONENT_TARGET = "head";

    private void addQueueResourceComponent(FacesContext context) {
        List<UIComponent> resources = context.getViewRoot().getComponentResources(context, QUEUE_RESOURCE_COMPONENT_TARGET);

        for (UIComponent resource : resources) {
            if (QueueResourceComponentRenderer.TYPE.equals(resource.getRendererType())) {
                return;
            }
        }

        Application application = context.getApplication();
        UIComponent queueResourceComponent = application.createComponent(context, UIOutput.COMPONENT_TYPE,
                QueueResourceComponentRenderer.TYPE);

        // fix for JSF duplicate ID exception
        queueResourceComponent.setId(QueueRegistry.QUEUE_SCRIPT_ID);

        context.getViewRoot().addComponentResource(context, queueResourceComponent, QUEUE_RESOURCE_COMPONENT_TARGET);
    }

    public void processEvent(ComponentSystemEvent event) throws AbortProcessingException {
        FacesContext context = FacesContext.getCurrentInstance();

        if (!getBooleanConfigurationValue(context, CommonComponentsConfiguration.Items.queueEnabled)) {
            return;
        }

        UIComponent comp = event.getComponent();

        if (!comp.isRendered()) {
            return;
        }

        String queueName = getQueueName(context, comp);
        QueueRegistry queueRegistry = QueueRegistry.getInstance(context);

        if (event instanceof PostAddToViewEvent) {
            queueRegistry.addQueue(queueName, comp);
            addQueueResourceComponent(context);
        } else if (event instanceof PreRemoveFromViewEvent) {
            queueRegistry.removeQueue(queueName);
        }
    }

    protected abstract String getQueueName(FacesContext context, UIComponent comp);
}
