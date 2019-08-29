package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.nc.js")
public class PhoneNCFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneNCFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_NC);
    }

}
