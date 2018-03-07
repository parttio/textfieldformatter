package org.vaadin.textfieldformatter;

import java.util.HashMap;
import java.util.Map;

import com.vaadin.shared.JavaScriptExtensionState;

public class AttributeExtensionState extends JavaScriptExtensionState {
    public Map<Object, String> attributes = new HashMap<>();
}
