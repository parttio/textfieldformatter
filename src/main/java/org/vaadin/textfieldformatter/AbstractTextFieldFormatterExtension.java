package org.vaadin.textfieldformatter;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.AbstractJavaScriptExtension;
import com.vaadin.ui.AbstractTextField;

/**
 * Extension to TextField allowing you to define formatting of the presentation
 * value of the field
 */
@JavaScript({ "cleave.min.js", "connector.js" })
public abstract class AbstractTextFieldFormatterExtension extends AbstractJavaScriptExtension {

	public AbstractTextFieldFormatterExtension(AbstractTextField field) {
		extend(field);
	}
	
	@Override
	protected TextFieldFormatterState getState() {
		return (TextFieldFormatterState) super.getState();
	}

}