package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.pe.js")
public class PhonePEFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhonePEFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_PE);
    }

}
