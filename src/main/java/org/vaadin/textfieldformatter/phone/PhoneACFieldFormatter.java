package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ac.js")
public class PhoneACFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneACFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_AC);
    }

}
