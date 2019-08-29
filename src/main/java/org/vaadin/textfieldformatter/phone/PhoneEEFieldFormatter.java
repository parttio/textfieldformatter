package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ee.js")
public class PhoneEEFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneEEFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_EE);
    }

}
