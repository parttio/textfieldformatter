package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.pw.js")
public class PhonePWFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhonePWFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_PW);
    }

}
