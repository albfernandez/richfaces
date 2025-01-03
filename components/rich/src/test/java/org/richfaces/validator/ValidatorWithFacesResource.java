package org.richfaces.validator;

import org.richfaces.javascript.ClientSideScript;

import jakarta.faces.application.ResourceDependency;

@ClientSideScript(function = "foo", resources = @ResourceDependency(name = "baz.js", library = "bar"))
public class ValidatorWithFacesResource {
}
