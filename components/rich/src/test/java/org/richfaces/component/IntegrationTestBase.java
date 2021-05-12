package org.richfaces.component;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.hamcrest.Matcher;
import org.jboss.test.faces.htmlunit.HtmlUnitEnvironment;
import org.junit.After;
import org.junit.Before;
import org.richfaces.CustomizedHtmlUnitEnvironment;

import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.javascript.host.event.Event;


public abstract class IntegrationTestBase {

    private HtmlUnitEnvironment environment;

    public IntegrationTestBase() {
        super();
    }

    @Before
    public void setUp() {
        this.environment = new CustomizedHtmlUnitEnvironment();
        this.environment.withResource("/" + getPageName() + ".xhtml", "org/richfaces/component/" + getPageName() + ".xhtml")
            .withResource("/WEB-INF/faces-config.xml", "org/richfaces/component/" + getFacesConfig());
        setupEnvironment(environment);
        this.environment.start();
    }

    protected void setupEnvironment(HtmlUnitEnvironment environment2) {
        // place for additional environment setup
    }

    protected abstract String getFacesConfig();

    protected abstract String getPageName();

    @After
    public void thearDown() throws Exception {
        environment.release();
        environment = null;
    }

    protected HtmlPage submitValueAndCheckMessage(String value, Matcher<String> matcher) throws Exception {
        HtmlPage page = requestPage();
        HtmlInput input = getInput(page);
        input.setValueAttribute(value);
        sleep(5000);
        input.fireEvent(Event.TYPE_BLUR);
        
        checkMessage(page, "uiMessage", matcher);
        return page;
    }
    private void sleep(long millis) {
    	try {
    		Thread.sleep(millis);
    	}
    	catch (InterruptedException ignore) {
    		//
    	}
    	
    }
    

    protected void checkMessage(HtmlPage page, String messageId, Matcher<String> matcher) {
        HtmlElement message = (HtmlElement) page.getElementById(messageId);
        assertThat(message.getTextContent(), matcher);
    }

    protected HtmlPage submit(HtmlPage page) throws IOException {
        HtmlInput input = getInput(page);
        input.fireEvent("blur");
        return page;
    }

    protected HtmlInput getInput(HtmlPage page) {
        HtmlForm htmlForm = page.getFormByName("form");
        assertNotNull(htmlForm);
        HtmlInput input = htmlForm.getInputByName("form:text");
        return input;
    }

    protected HtmlPage requestPage() throws IOException {
        HtmlPage page = environment.getPage("/" + getPageName() + ".jsf");
        return page;
    }

}
