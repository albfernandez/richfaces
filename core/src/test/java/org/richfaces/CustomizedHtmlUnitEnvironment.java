package org.richfaces;

import org.htmlunit.BrowserVersion;
import org.jboss.test.faces.ServletHolder;
import org.jboss.test.faces.htmlunit.HtmlUnitEnvironment;
import org.richfaces.webapp.ResourceServlet;


public class CustomizedHtmlUnitEnvironment extends HtmlUnitEnvironment {

    private static ThreadLocal<ResourceServletHolder> RESOURCE_SERVLET_HOLDER = new ThreadLocal<CustomizedHtmlUnitEnvironment.ResourceServletHolder>() {
        protected ResourceServletHolder initialValue() {
            return new ResourceServletHolder();
        };
    };

    public CustomizedHtmlUnitEnvironment() {
        this.getServer().addServlet(RESOURCE_SERVLET_HOLDER.get());
        this.getServer().addInitParameter("org.richfaces.push.jms.enabled", "false");
        this.setBrowserVersion(BrowserVersion.INTERNET_EXPLORER);
    }

    private static class ResourceServletHolder extends ServletHolder {

        private ResourceServletHolder() {
            super("/org.richfaces.resources/*", new ResourceServlet());
        }
    }

}
