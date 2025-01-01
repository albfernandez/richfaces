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
package org.richfaces.component.repeat;

import static java.text.MessageFormat.format;

import static org.jboss.arquillian.graphene.Graphene.guardAjax;
import static org.junit.Assert.assertEquals;

import java.net.URL;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.richfaces.integration.A4JDeployment;

@RunWith(Arquillian.class)
@RunAsClient
public class ITNestedRepeat {

    private static final String INPUT_LOCATOR_TEMPLATE = "form:outer:{0}:inner:0:input";

    @FindBy(id = "form:ajax")
    private WebElement ajaxSubmitButton;

    @Drone
    private WebDriver browser;

    @ArquillianResource
    private URL contextPath;

    @Deployment(testable = false)
    public static WebArchive deployment() {
        A4JDeployment deployment = new A4JDeployment(ITNestedRepeat.class);

        deployment.archive()
                .addClasses(NestedDataBean.class)
                .addAsWebResource(ITNestedRepeat.class.getResource("NestedRepeatTest.xhtml"), "NestedRepeatTest.xhtml");

        return deployment.getFinalArchive();
    }

    @Test
    public void testRendering() {
        browser.get(contextPath + "NestedRepeatTest.jsf");
        WebElement input;
        for (int i = 0; i < 3; i++) {
            input = browser.findElement(By.id(format(INPUT_LOCATOR_TEMPLATE, i)));
            input.sendKeys(Integer.toString(i));
        }

        guardAjax(ajaxSubmitButton).click();

        for (int i = 0; i < 3; i++) {
            input = browser.findElement(By.id(format(INPUT_LOCATOR_TEMPLATE, i)));
            assertEquals(Integer.toString(i), input.getAttribute("value"));
        }
    }
}
