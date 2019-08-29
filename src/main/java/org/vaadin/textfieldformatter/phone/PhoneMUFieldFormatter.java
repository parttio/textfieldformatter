package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.mu.js")
public class PhoneMUFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMUFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MU);
    }

}
