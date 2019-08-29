package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ga.js")
public class PhoneGAFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGAFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GA);
    }

}
