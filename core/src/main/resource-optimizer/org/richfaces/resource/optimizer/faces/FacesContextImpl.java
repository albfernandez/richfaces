/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and individual contributors
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
package org.richfaces.resource.optimizer.faces;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import jakarta.el.ELContext;
import jakarta.faces.application.Application;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.application.FacesMessage.Severity;
import jakarta.faces.component.UIViewRoot;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.ResponseStream;
import jakarta.faces.context.ResponseWriter;
import jakarta.faces.lifecycle.Lifecycle;
import jakarta.faces.render.RenderKit;

/**
 * @author Nick Belaevski
 *
 */
public class FacesContextImpl extends FacesContext {
    private Map<Object, Object> attributes = new HashMap<>();
    private ELContext elContext = createELContext();
    private ExternalContextImpl externalContext = new ExternalContextImpl();
    private ApplicationImpl application = new ApplicationImpl();

    public FacesContextImpl() {
        setCurrentInstance(this);
    }

    private ELContext createELContext() {
        ELContext result = new ELContextImpl();
        result.putContext(FacesContext.class, this);
        return result;
    }

    @Override
    public Application getApplication() {
        return application;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#getClientIdsWithMessages()
     */
    @Override
    public Iterator<String> getClientIdsWithMessages() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#getExternalContext()
     */
    @Override
    public ExternalContextImpl getExternalContext() {
        // TODO Auto-generated method stub
        return externalContext;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#getMaximumSeverity()
     */
    @Override
    public Severity getMaximumSeverity() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#getMessages()
     */
    @Override
    public Iterator<FacesMessage> getMessages() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#getMessages(java.lang.String)
     */
    @Override
    public Iterator<FacesMessage> getMessages(String clientId) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#getRenderKit()
     */
    @Override
    public RenderKit getRenderKit() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#getRenderResponse()
     */
    @Override
    public boolean getRenderResponse() {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#getResponseComplete()
     */
    @Override
    public boolean getResponseComplete() {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#getResponseStream()
     */
    @Override
    public ResponseStream getResponseStream() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#setResponseStream(jakarta.faces.context.ResponseStream)
     */
    @Override
    public void setResponseStream(ResponseStream responseStream) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#getResponseWriter()
     */
    @Override
    public ResponseWriter getResponseWriter() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#setResponseWriter(jakarta.faces.context.ResponseWriter)
     */
    @Override
    public void setResponseWriter(ResponseWriter responseWriter) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#getViewRoot()
     */
    @Override
    public UIViewRoot getViewRoot() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#setViewRoot(jakarta.faces.component.UIViewRoot)
     */
    @Override
    public void setViewRoot(UIViewRoot root) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#addMessage(java.lang.String, jakarta.faces.application.FacesMessage)
     */
    @Override
    public void addMessage(String clientId, FacesMessage message) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#release()
     */
    @Override
    public void release() {
        setCurrentInstance(null);
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#renderResponse()
     */
    @Override
    public void renderResponse() {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#responseComplete()
     */
    @Override
    public void responseComplete() {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.context.FacesContext#getAttributes()
     */
    @Override
    public Map<Object, Object> getAttributes() {
        return attributes;
    }

    @Override
    public ELContext getELContext() {
        return elContext;
    }

    //MZ TODO
	@Override
	public Lifecycle getLifecycle() {
		// TODO Auto-generated method stub
		return null;
	}
}
