package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.de.js")
public class PhoneDEFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneDEFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_DE);
    }

}
