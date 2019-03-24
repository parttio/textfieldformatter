package org.vaadin.textfieldformatter;

import com.vaadin.flow.component.textfield.TextField;

public class PhoneFieldFormatter extends CleaveExtension {

	public PhoneFieldFormatter(String phoneRegionCode) {
		getConfiguration().phone = true;
		getConfiguration().phoneRegionCode = phoneRegionCode;
	}

	/**
	 * Attaches this extension to a TextField. Extension cannot be moved to another
	 * TextField again.
	 * 
	 * @param textField
	 *            TextField to attach this extension to
	 */
	public void extend(TextField textField) {
		super.extend(textField);
	}
}
