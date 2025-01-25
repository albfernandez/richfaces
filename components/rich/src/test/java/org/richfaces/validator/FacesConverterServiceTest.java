package org.richfaces.validator;

import static org.easymock.EasyMock.expect;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIInput;
import jakarta.faces.component.UIViewRoot;
import jakarta.faces.convert.BooleanConverter;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.ConverterException;
import jakarta.faces.convert.DateTimeConverter;
import jakarta.faces.convert.IntegerConverter;
import jakarta.faces.render.ClientBehaviorRenderer;

import org.jboss.test.faces.mock.Environment;
import org.jboss.test.faces.mock.Environment.Feature;
import org.jboss.test.faces.mock.Mock;
import org.jboss.test.faces.mock.MockController;
import org.jboss.test.faces.mock.MockFacesEnvironment;
import org.jboss.test.faces.mock.MockTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(MockTestRunner.class)
public class FacesConverterServiceTest {
    @Mock()
    @Environment({ Feature.APPLICATION })
    protected MockFacesEnvironment environment;
    protected FacesConverterService serviceImpl;
    @Mock
    protected UIViewRoot viewRoot;
    @Mock
    protected UIInput input;
    @Mock
    protected ClientBehaviorRenderer behaviorRenderer;
    protected MockController controller;
    protected Converter converter;

    @Before
    public void setUp() {
        // create service impl.
        serviceImpl = new ConverterServiceImpl();
        expect(environment.getFacesContext().getViewRoot()).andStubReturn(viewRoot);
        expect(viewRoot.getLocale()).andStubReturn(Locale.ENGLISH);
        expect(environment.getApplication().getMessageBundle()).andStubReturn("javax.faces.Messages");
        HashMap<String, Object> attributes = new HashMap<>();
        attributes.put("label", "foo");
        expect(input.getAttributes()).andStubReturn(attributes);
    }

    @After
    public void tearDown() {
        controller.verify();
        serviceImpl = null;
        controller.release();
    }

    @Test
    public void getConverterClass() throws Exception {
        converter = new BooleanConverter();
        controller.replay();
        ConverterDescriptor converterDescription = serviceImpl.getConverterDescription(environment.getFacesContext(), input,
            converter, null);
        assertEquals(converter.getClass(), converterDescription.getImplementationClass());
    }

    @Test
    public void getConverterMessage() throws Exception {
        converter = new IntegerConverter();
        FacesMessage facesMessage = null;
        controller.replay();
        try {
            converter.getAsObject(environment.getFacesContext(), input, "abc");
        } catch (ConverterException e) {
            facesMessage = e.getFacesMessage();
        }
        assertNotNull(facesMessage);
        ConverterDescriptor converterDescription = serviceImpl.getConverterDescription(environment.getFacesContext(), input,
            converter, null);
        String summary = converterDescription.getMessage().getSummary();
        summary = summary.replace("{2}", "foo");
        summary = summary.replace("'{0}'", "abc");
        assertEquals(facesMessage.getSummary(), summary);
    }

    @Test
    public void getConverterParameters() throws Exception {
        DateTimeConverter converter = new DateTimeConverter();

        converter.setDateStyle("short");
        converter.setPattern("MM/DD/YYYY");
        converter.setTimeStyle("full");
        converter.setType("both");
        converter.setTimeZone(TimeZone.getTimeZone("EST"));
        controller.replay();
        ConverterDescriptor converterDescription = serviceImpl.getConverterDescription(environment.getFacesContext(), input,
            converter, null);
        Map<String, ? extends Object> additionalParameters = converterDescription.getAdditionalParameters();
        assertEquals("short", additionalParameters.get("dateStyle"));
        assertEquals("MM/DD/YYYY", additionalParameters.get("pattern"));
    }
}
