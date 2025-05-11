package org.richfaces.demo.tables.model.capitals;

import java.net.URL;
import java.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.FacesException;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class CapitalsParser {
    private List<Capital> capitalsList;

    @XmlRootElement(name = "capitals")
    private static final class CapitalsHolder {
        private List<Capital> capitals;

        @XmlElement(name = "capital")
        public List<Capital> getCapitals() {
            return capitals;
        }

        @SuppressWarnings("unused")
        public void setCapitals(List<Capital> capitals) {
            this.capitals = capitals;
        }
    }

    public synchronized List<Capital> getCapitalsList() {
        if (capitalsList == null) {
            ClassLoader ccl = Thread.currentThread().getContextClassLoader();
            URL resource = ccl.getResource("org/richfaces/demo/data/capitals/capitals.xml");
            JAXBContext context;
            try {
                context = JAXBContext.newInstance(CapitalsHolder.class);
                CapitalsHolder capitalsHolder = (CapitalsHolder) context.createUnmarshaller().unmarshal(resource);
                capitalsList = capitalsHolder.getCapitals();
            } catch (JAXBException e) {
                throw new FacesException(e.getMessage(), e);
            }
        }

        return capitalsList;
    }
}
