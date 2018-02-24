package org.vaadin.textfieldformatter;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.AbstractJavaScriptExtension;
import com.vaadin.ui.AbstractTextField;

@JavaScript({ "cleave-phone.i18n.js", "phone_connector.js" })
public class PhoneFieldFormatter extends CleaveExtension {

	public PhoneFieldFormatter(String phoneRegionCode) {
		getState().phoneRegionCode = phoneRegionCode;
	}

	@Override
	protected PhoneFieldFormatterState getState() {
		return (PhoneFieldFormatterState) super.getState();
	}

	/**
	 * Attaches this extension to a TextField. Extension cannot be moved to
	 * another TextField again.
	 * 
	 * @param textField
	 *            TextField to attach this extension to
	 */
	public void extend(AbstractTextField textField) {
		super.extend(textField);
	}
}
