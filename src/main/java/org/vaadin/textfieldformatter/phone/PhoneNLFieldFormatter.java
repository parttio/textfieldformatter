package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.nl.js")
public class PhoneNLFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneNLFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_NL);
    }

}
