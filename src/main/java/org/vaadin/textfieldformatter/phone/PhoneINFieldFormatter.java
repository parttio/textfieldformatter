package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.in.js")
public class PhoneINFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneINFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_IN);
    }

}
