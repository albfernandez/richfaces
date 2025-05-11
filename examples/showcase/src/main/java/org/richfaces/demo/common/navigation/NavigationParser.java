package org.richfaces.demo.common.navigation;

import java.net.URL;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.FacesException;
import jakarta.inject.Named;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@Named("navigationParser")
@ApplicationScoped
public class NavigationParser {
    private List<GroupDescriptor> groupsList;

    @XmlRootElement(name = "root")
    private static final class GroupsHolder {
        private List<GroupDescriptor> groups;

        @XmlElement(name = "group")
        public List<GroupDescriptor> getGroups() {
            return groups;
        }

        @SuppressWarnings("unused")
        public void setGroups(List<GroupDescriptor> groups) {
            this.groups = groups;
        }
    }

    public synchronized List<GroupDescriptor> getGroupsList() {
        if (groupsList == null) {
            ClassLoader ccl = Thread.currentThread().getContextClassLoader();
            URL resource = ccl.getResource("org/richfaces/demo/data/common/navigation.xml");
            JAXBContext context;
            try {
                context = JAXBContext.newInstance(GroupsHolder.class);
                GroupsHolder groupsHolder = (GroupsHolder) context.createUnmarshaller().unmarshal(resource);
                groupsList = groupsHolder.getGroups();
            } catch (JAXBException e) {
                throw new FacesException(e.getMessage(), e);
            }
        }

        return groupsList;
    }
}
