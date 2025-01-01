package org.richfaces.demo.tree.adaptors;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

@ManagedBean
@RequestScoped
public class FileSystemBean {
    private static final String SRC_PATH = "/WEB-INF";
    private List<FileSystemNode> srcRoots;

    public synchronized List<FileSystemNode> getSourceRoots() {
        if (srcRoots == null) {
            srcRoots = new FileSystemNode(SRC_PATH).getDirectories();
        }

        return srcRoots;
    }
}
