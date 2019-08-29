package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ge.js")
public class PhoneGEFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGEFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GE);
    }

}
