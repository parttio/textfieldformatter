package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.gb.js")
public class PhoneGBFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGBFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GB);
    }

}
