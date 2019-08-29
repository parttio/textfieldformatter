package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ae.js")
public class PhoneAEFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneAEFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_AE);
    }

}
