package org.vaadin.textfieldformatter;

import com.vaadin.ui.AbstractTextField;

public class PhoneFieldFormatter extends AbstractTextFieldFormatterExtension {

	public PhoneFieldFormatter(AbstractTextField field, String phoneRegionCode) {
		super(field);
		getState().formatPhone = true;
		getState().phoneRegionCode = phoneRegionCode;
	}
	
}
