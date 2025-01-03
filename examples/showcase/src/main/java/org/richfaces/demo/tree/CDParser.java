package org.richfaces.demo.tree;

import jakarta.faces.FacesException;
import jakarta.faces.bean.ApplicationScoped;
import jakarta.faces.bean.ManagedBean;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.net.URL;
import java.util.List;

@ManagedBean(name = "cdsParser")
@ApplicationScoped
public class CDParser {
    private List<CDXmlDescriptor> cdsList;

    public synchronized List<CDXmlDescriptor> getCdsList() {
        if (cdsList == null) {
            ClassLoader ccl = Thread.currentThread().getContextClassLoader();
            URL resource = ccl.getResource("org/richfaces/demo/tree/CDCatalog.xml");
            JAXBContext context;
            try {
                context = JAXBContext.newInstance(CDsHolder.class);
                CDsHolder cdsHolder = (CDsHolder) context.createUnmarshaller().unmarshal(resource);
                cdsList = cdsHolder.getCds();
            } catch (JAXBException e) {
                throw new FacesException(e.getMessage(), e);
            }
        }

        return cdsList;
    }

    @XmlRootElement(name = "CATALOG")
    private static final class CDsHolder {
        private List<CDXmlDescriptor> cds;

        @XmlElement(name = "CD")
        public List<CDXmlDescriptor> getCds() {
            return cds;
        }

        @SuppressWarnings("unused")
        public void setCds(List<CDXmlDescriptor> cds) {
            this.cds = cds;
        }
    }
}
