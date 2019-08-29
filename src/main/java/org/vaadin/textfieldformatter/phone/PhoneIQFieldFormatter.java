package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.iq.js")
public class PhoneIQFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneIQFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_IQ);
    }

}
