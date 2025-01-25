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
package org.richfaces.skin;

import jakarta.annotation.Nonnull;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Set;

/**
 * @author shura (latest modification by $Author: alexsmirnov $)
 * @version $Revision: 1.1.2.1 $ $Date: 2007/01/09 18:59:40 $
 */
@Named("a4jSkin")
@ApplicationScoped
public class SkinBean extends AbstractMap<Object, Object> implements Skin, Serializable {
    /*
     * (non-Javadoc)
     *
     * @see org.richfaces.skin.Skin#hashCode(jakarta.faces.context.FacesContext)
     */
    public int hashCode(FacesContext context) {
        return getSkin().hashCode(context);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.AbstractMap#entrySet()
     */
    @Override
    @Nonnull
    public Set<Entry<Object, Object>> entrySet() {
        return Collections.emptySet();
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.AbstractMap#containsKey(java.lang.Object)
     */
    @Override
    public boolean containsKey(Object key) {
        if (null == key) {
            return false;
        }

        return getSkin().containsProperty(key.toString());
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.AbstractMap#get(java.lang.Object)
     */
    @Override
    public Object get(Object key) {
        if (null == key) {
            return null;
        }

        return getSkin().getParameter(FacesContext.getCurrentInstance(), key.toString());
    }

    private Skin getSkin() {
        FacesContext context = FacesContext.getCurrentInstance();

        return SkinFactory.getInstance(context).getSkin(context);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.AbstractMap#toString()
     */
    @Override
    public String toString() {
        return getSkin().toString();
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.AbstractMap#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.richfaces.skin.Skin#getParameter(jakarta.faces.context.FacesContext, java.lang.String)
     */
    public Object getParameter(FacesContext context, String name) {
        return getSkin().getParameter(context, name);
    }

    public Object getParameter(FacesContext context, String name, Object defaultValue) {
        return getSkin().getParameter(context, name, defaultValue);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.richfaces.skin.Skin#containsProperty(java.lang.String)
     */
    public boolean containsProperty(String name) {
        return getSkin().containsProperty(name);
    }

    /* Static methods for manipulate skins */
    public static Object skinHashCode() {
        FacesContext context = FacesContext.getCurrentInstance();
        int hashCode = SkinFactory.getInstance(context).getSkin(context).hashCode(context);
        return ByteBuffer.allocate(4).putInt(hashCode).array();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.richfaces.skin.Skin#getColorParameter(jakarta.faces.context.FacesContext, java.lang.String)
     */
    public Integer getColorParameter(FacesContext context, String name) {
        return getSkin().getColorParameter(context, name);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.richfaces.skin.Skin#getColorParameter(jakarta.faces.context.FacesContext, java.lang.String, java.lang.Object)
     */
    public Integer getColorParameter(FacesContext context, String name, Object defaultValue) {
        return getSkin().getColorParameter(context, name, defaultValue);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.richfaces.skin.Skin#getIntegerParameter(jakarta.faces.context.FacesContext, java.lang.String)
     */
    public Integer getIntegerParameter(FacesContext context, String name) {
        return getSkin().getIntegerParameter(context, name);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.richfaces.skin.Skin#getIntegerParameter(jakarta.faces.context.FacesContext, java.lang.String, java.lang.Object)
     */
    public Integer getIntegerParameter(FacesContext context, String name, Object defaultValue) {
        return getSkin().getIntegerParameter(context, name, defaultValue);
    }

    public String getName() {
        return getSkin().getName();
    }

    public String imageUrl(String resourceName) {
        return getSkin().imageUrl(resourceName);
    }
}
