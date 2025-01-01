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

package org.richfaces.validator;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.richfaces.javascript.Message;

import javax.faces.application.FacesMessage;
import java.util.Map;

public class BaseFacesObjectDescriptor<T> {
    private final Class<? extends T> converterClass;
    private final Message message;
    private Map<String, Object> parameters = Maps.newHashMap();

    public BaseFacesObjectDescriptor(Class<? extends T> converterClass, FacesMessage message) {
        this.converterClass = converterClass;
        this.message = new Message(message);
    }

    public Class<?> getImplementationClass() {
        return converterClass;
    }

    public Map<String, ? extends Object> getAdditionalParameters() {
        return parameters;
    }

    public Message getMessage() {
        return message;
    }

    protected void addParameter(String name, Object value) {
        parameters.put(name, value);
    }

    protected void makeImmutable() {
        parameters = ImmutableMap.copyOf(parameters);
    }
}
