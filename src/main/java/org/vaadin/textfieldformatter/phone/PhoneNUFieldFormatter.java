package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.nu.js")
public class PhoneNUFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneNUFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_NU);
    }

}
