package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.gy.js")
public class PhoneGYFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGYFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GY);
    }

}
