package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.er.js")
public class PhoneERFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneERFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_ER);
    }

}
