package org.vaadin.textfieldformatter;

import com.vaadin.ui.AbstractComponent;

public class AttributeExtension extends CleaveExtension {

    @Override
    protected AttributeExtensionState getState() {
            return (AttributeExtensionState) super.getState();
    }

    protected void extend(AbstractComponent target) {
	    super.extend(target);
    }

    public void addAttribute(String key, String value) {
            getState().attributes.put(key, value);
    }

    public void removeAttribute(String key) {
            getState().attributes.remove(key);
    }
}
