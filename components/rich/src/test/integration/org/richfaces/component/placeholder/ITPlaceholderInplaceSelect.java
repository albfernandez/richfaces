/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat, Inc. and individual contributors
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
package org.richfaces.component.placeholder;

import static org.junit.Assert.assertEquals;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.graphene.Graphene;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.support.FindBy;
import org.richfaces.integration.RichDeployment;
import org.richfaces.shrinkwrap.descriptor.FaceletAsset;

import category.Failing;

/**
 * @author <a href="mailto:jstefek@redhat.com">Jiri Stefek</a>
 */
public class ITPlaceholderInplaceSelect extends AbstractPlaceholderTest {

    @FindBy(css = INPUT_SELECTOR)
    private InplaceSelectInput firstInplaceSelect;

    @Deployment(testable = false)
    public static WebArchive createDeployment() {
        RichDeployment deployment = new RichDeployment(ITPlaceholderInplaceSelect.class);

        deployment.archive().addClasses(PlaceHolderValueConverter.class, PlaceHolderValue.class);

        FaceletAsset p;
        p = placeholderFacelet("index.xhtml", deployment);
        p.body("<rich:inplaceSelect id='input'>");
        p.body("    <f:selectItems value='#{placeHolderValue.items}' />");
        p.body("    <rich:placeholder id='placeholderID' styleClass='#{param.styleClass}' value='Placeholder Text' />");
        p.body("</rich:inplaceSelect>");

        p = placeholderFacelet("selector.xhtml", deployment);
        p.body("<rich:inplaceSelect id='input' />");
        p.body("<rich:placeholder id='placeholderID' value='Placeholder Text' selector='[id=input]' />");

        p = placeholderFacelet("rendered.xhtml", deployment);
        p.body("<rich:inplaceSelect id='input' defaultLabel='#{not empty param.defaultLabel ? param.defaultLabel : null}' >");
        p.body("    <rich:placeholder id='placeholderID' value='Placeholder Text' rendered='false' />");
        p.body("</rich:inplaceSelect>");

        p = placeholderFacelet("converter.xhtml", deployment);
        p.body("<rich:inplaceSelect id='input' >");
        p.body("    <rich:placeholder id='placeholderID' converter='placeHolderValueConverter' value='#{placeHolderValue}' />");
        p.body("</rich:inplaceSelect>");

        p = placeholderFacelet("submit.xhtml", deployment);
        p.form("<rich:inplaceSelect id='input' value='#{placeHolderValue.value2}' >");
        p.form("    <f:selectItems value='#{placeHolderValue.items}' />");
        p.form("    <rich:placeholder id='placeholderID' value='Placeholder Text' />");
        p.form("</rich:inplaceSelect>");
        p.form("<br />");
        p.form("<a4j:commandButton id='ajaxSubmit' value='ajax submit' execute='@form' render='output' />");
        p.form("<h:commandButton id='httpSubmit' value='http submit' />");
        p.form("<br />");
        p.form("<h:outputText id='output' value='#{placeHolderValue.value2}' />");

        return deployment.getFinalArchive();
    }

    @Override
    protected String getTestedValue() {
        return "item1";
    }

    @Override
    protected String getTestedValueResponse() {
        return "item1";
    }

    @Override
    Input input() {
        return firstInplaceSelect;
    }

    @Test
    @Ignore("current implementation uses native browser placeholder")
    @Override
    public void testAjaxSendsEmptyValue() {
        // given
        getBrowser().get(getContextPath().toExternalForm() + "submit.jsf");

        //when
        Graphene.guardAjax(getA4jSubmitBtn()).click();

        // then
        Graphene.waitAjax().until().element(getOutput()).is().not().visible();
    }

    /**
     * {@link https://issues.jboss.org/browse/RF-12651}
     */
    @Test
    @Ignore("current implementation uses native browser placeholder")
    @Override
    @Category(Failing.class)
    public void testDefaultAttributes() {
    }

    @Test
    @Ignore("current implementation uses native browser placeholder")
    @Override
    public void testRendered() {
        // having
        getBrowser().get(getContextPath().toExternalForm() + "rendered.jsf");
        // then
        assertEquals("", input().getDefaultText().trim());
    }

    /**
     * {@link https://issues.jboss.org/browse/RF-12651}
     */
    @Test
    @Ignore("current implementation uses native browser placeholder")
    @Category(Failing.class)
    @Override
    public void testSelector() {
    }

    /**
     * {@link https://issues.jboss.org/browse/RF-12651}
     */
    @Test
    @Ignore("current implementation uses native browser placeholder")
    @Category(Failing.class)
    @Override
    public void testStyleClass() {
    }

    @Test
    @Ignore("current implementation uses native browser placeholder")
    public void testWhenPlaceholderIsNotRenderedAndDefaultLabelIsDefined_defaultLabelShouldBeUsed() {
        // having
        getBrowser().get(getContextPath().toExternalForm() + "rendered.jsf?defaultLabel=defaultLabel");
        // then
        assertEquals("defaultLabel", input().getDefaultText());
    }

    /**
     * {@link https://issues.jboss.org/browse/RF-12651}
     */
    @Test
    @Ignore("current implementation uses native browser placeholder")
    @Category(Failing.class)
    @Override
    public void testWhenTextIsChanged_textChangesColorToDefaultAndRemovesPlaceholderStyleClasses() {
    }

    /**
     * {@link https://issues.jboss.org/browse/RF-12651}
     */
    @Test
    @Ignore("current implementation uses native browser placeholder")
    @Override
    @Category(Failing.class)
    public void testWhenTextIsCleared_inputGetsPlaceholderTextAndStyleAgain() {
    }
}
