package org.richfaces.renderkit;

import jakarta.faces.application.ResourceDependencies;
import jakarta.faces.application.ResourceDependency;

@ResourceDependencies({ @ResourceDependency(library = "org.richfaces", name = "jquery.js"),
        @ResourceDependency(library = "org.richfaces", name = "richfaces.js"),
        @ResourceDependency(library = "org.richfaces", name = "richfaces-csv.js") })
public class CSVResourceDependenciesOrdering {

}