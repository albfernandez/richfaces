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

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

import org.richfaces.application.ServiceTracker;

import jakarta.el.ELException;
import jakarta.el.ExpressionFactory;
import jakarta.el.ValueExpression;
import jakarta.faces.FacesException;
import jakarta.faces.application.Application;
import jakarta.faces.application.NavigationHandler;
import jakarta.faces.application.ProjectStage;
import jakarta.faces.application.ResourceHandler;
import jakarta.faces.application.StateManager;
import jakarta.faces.application.ViewHandler;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.event.ActionListener;
import jakarta.faces.validator.Validator;

/**
 * @author Nick Belaevski
 *
 */
public class ApplicationImpl extends Application {
    private ExpressionFactory expressionFactory = createExpressionFactory();

    private ExpressionFactory createExpressionFactory() {
        try {
            return ExpressionFactory.newInstance(); //MZ (ExpressionFactory) Class.forName("jakarta.el.ExpressionFactory").getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#getActionListener()
     */
    @Override
    public ActionListener getActionListener() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#setActionListener(jakarta.faces.event.ActionListener)
     */
    @Override
    public void setActionListener(ActionListener listener) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#getDefaultLocale()
     */
    @Override
    public Locale getDefaultLocale() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#setDefaultLocale(java.util.Locale)
     */
    @Override
    public void setDefaultLocale(Locale locale) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#getDefaultRenderKitId()
     */
    @Override
    public String getDefaultRenderKitId() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#setDefaultRenderKitId(java.lang.String)
     */
    @Override
    public void setDefaultRenderKitId(String renderKitId) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#getMessageBundle()
     */
    @Override
    public String getMessageBundle() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#setMessageBundle(java.lang.String)
     */
    @Override
    public void setMessageBundle(String bundle) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#getNavigationHandler()
     */
    @Override
    public NavigationHandler getNavigationHandler() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#setNavigationHandler(jakarta.faces.application.NavigationHandler)
     */
    @Override
    public void setNavigationHandler(NavigationHandler handler) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#getPropertyResolver()
     */
    /*MZ
    @SuppressWarnings("deprecation")
    @Override
    public jakarta.faces.el.PropertyResolver getPropertyResolver() {
        // TODO Auto-generated method stub
        return null;
    }
    */

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#setPropertyResolver(jakarta.faces.el.PropertyResolver)
     */
    /*MZ
    @SuppressWarnings("deprecation")
    @Override
    public void setPropertyResolver(jakarta.faces.el.PropertyResolver resolver) {
        // TODO Auto-generated method stub

    }
    */

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#getVariableResolver()
     */
    /*MZ
    @SuppressWarnings("deprecation")
    @Override
    public jakarta.faces.el.VariableResolver getVariableResolver() {
        // TODO Auto-generated method stub
        return null;
    }
    */

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#setVariableResolver(jakarta.faces.el.VariableResolver)
     */
    /*MZ
    @SuppressWarnings("deprecation")
    @Override
    public void setVariableResolver(jakarta.faces.el.VariableResolver resolver) {
        // TODO Auto-generated method stub

    }
    */

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#getViewHandler()
     */
    @Override
    public ViewHandler getViewHandler() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#setViewHandler(jakarta.faces.application.ViewHandler)
     */
    @Override
    public void setViewHandler(ViewHandler handler) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#getStateManager()
     */
    @Override
    public StateManager getStateManager() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#setStateManager(jakarta.faces.application.StateManager)
     */
    @Override
    public void setStateManager(StateManager manager) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#addComponent(java.lang.String, java.lang.String)
     */
    @Override
    public void addComponent(String componentType, String componentClass) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#createComponent(java.lang.String)
     */
    @Override
    public UIComponent createComponent(String componentType) throws FacesException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#createComponent(jakarta.faces.el.ValueBinding, jakarta.faces.context.FacesContext,
     * java.lang.String)
     */
    /*MZ
    @SuppressWarnings("deprecation")
    @Override
    public UIComponent createComponent(jakarta.faces.el.ValueBinding componentBinding, FacesContext context, String componentType)
            throws FacesException {
        // TODO Auto-generated method stub
        return null;
    }
    */

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#getComponentTypes()
     */
    @Override
    public Iterator<String> getComponentTypes() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#addConverter(java.lang.String, java.lang.String)
     */
    @Override
    public void addConverter(String converterId, String converterClass) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#addConverter(java.lang.Class, java.lang.String)
     */
    @Override
    public void addConverter(Class<?> targetClass, String converterClass) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#createConverter(java.lang.String)
     */
    @Override
    public Converter createConverter(String converterId) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#createConverter(java.lang.Class)
     */
    @Override
    public Converter createConverter(Class<?> targetClass) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#getConverterIds()
     */
    @Override
    public Iterator<String> getConverterIds() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#getConverterTypes()
     */
    @Override
    public Iterator<Class<?>> getConverterTypes() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#createMethodBinding(java.lang.String, java.lang.Class<?>[])
     */
    /*MZ
    @SuppressWarnings("deprecation")
    @Override
    public jakarta.faces.el.MethodBinding createMethodBinding(String ref, Class<?>[] params) throws jakarta.faces.el.ReferenceSyntaxException {
        // TODO Auto-generated method stub
        return null;
    }
    */

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#getSupportedLocales()
     */
    @Override
    public Iterator<Locale> getSupportedLocales() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#setSupportedLocales(java.util.Collection)
     */
    @Override
    public void setSupportedLocales(Collection<Locale> locales) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#addValidator(java.lang.String, java.lang.String)
     */
    @Override
    public void addValidator(String validatorId, String validatorClass) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#createValidator(java.lang.String)
     */
    @Override
    public Validator createValidator(String validatorId) throws FacesException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#getValidatorIds()
     */
    @Override
    public Iterator<String> getValidatorIds() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#createValueBinding(java.lang.String)
     */
    /*MZ
    @SuppressWarnings("deprecation")
    @Override
    public jakarta.faces.el.ValueBinding createValueBinding(String ref) throws jakarta.faces.el.ReferenceSyntaxException {
        // TODO Auto-generated method stub
        return null;
    }
    */

    @Override
    public ProjectStage getProjectStage() {
        return ProjectStage.Development;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#getExpressionFactory()
     */
    @Override
    public ExpressionFactory getExpressionFactory() {
        return expressionFactory;
    }

    /*
     * (non-Javadoc)
     *
     * @see jakarta.faces.application.Application#getResourceHandler()
     */
    @Override
    public ResourceHandler getResourceHandler() {
        return ServiceTracker.getService(ResourceHandler.class);
    }

    @SuppressWarnings("unchecked") // Forced cast on T
    @Override
    public <T> T evaluateExpressionGet(FacesContext context, String expression, Class<? extends T> expectedType)
            throws ELException {
        ValueExpression ve = getExpressionFactory().createValueExpression(context.getELContext(), expression, expectedType);
        return (T) (ve.getValue(context.getELContext()));
    }
}
