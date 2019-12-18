package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

/**
 * Formatter for phone numbers. Provide the region code in the constructor. This
 * formatter includes all the regions supported by Cleave into a single bundle
 * resulting in a bigger file size loaded by the browser. Use this if you need
 * to support more than one region or want to create formatters without knowing the class
 * name compile time. If you want to support specific regions separately, use
 * PhoneXXFieldFormatter classes, e.g. PhoneUSFieldFormatter.
 * 
 * 
 */
@JsModule("cleave.js/dist/addons/cleave-phone.i18n.js")
public class PhoneI18nFieldFormatter extends AbstractPhoneFieldFormatter {

	public PhoneI18nFieldFormatter(String phoneRegionCode) {
		super(phoneRegionCode);
	}

}
