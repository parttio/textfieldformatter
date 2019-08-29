package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.be.js")
public class PhoneBEFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBEFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BE);
    }

}
