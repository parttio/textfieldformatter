package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@JsModule( "./jh-textfield-formatter/import-libphonenumber.js")
@NpmPackage(value = "google-libphonenumber", version = "3.2.32")
public class PhoneI18nFieldFormatter extends AbstractPhoneFieldFormatter {

	public PhoneI18nFieldFormatter(String phoneRegionCode) {
		super(phoneRegionCode);
	}

}
