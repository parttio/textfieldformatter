package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ro.js")
public class PhoneROFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneROFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_RO);
    }

}
