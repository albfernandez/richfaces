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
package org.richfaces.demo.core;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.NoneScoped;
import jakarta.faces.context.FacesContext;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.ActionEvent;
import jakarta.faces.event.ActionListener;

/**
 * @author Nick Belaevski
 */
@ManagedBean
@NoneScoped
public class ActionListenerBean {
    private ActionListener actionListener = new BoundActionListener();

    private static void addFacesMessage(String messageText) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(messageText));
    }

    public void handleActionMethod(ActionEvent event) throws AbortProcessingException {
        addFacesMessage("Method expression listener called");
    }

    public void handleActionMethodComposite(ActionEvent event) throws AbortProcessingException {
        addFacesMessage("Method expression listener called from composite component");
    }

    public ActionListener getActionListener() {
        return actionListener;
    }

    public static final class ActionListenerImpl implements ActionListener {
        public void processAction(ActionEvent event) throws AbortProcessingException {
            addFacesMessage("Implementation of ActionListener created and called: " + this);
        }
    }

    private static final class BoundActionListener implements ActionListener {
        public void processAction(ActionEvent event) throws AbortProcessingException {
            addFacesMessage("Bound listener called");
        }
    }
}
