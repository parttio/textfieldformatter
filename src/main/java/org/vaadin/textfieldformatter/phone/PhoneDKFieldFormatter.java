package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.dk.js")
public class PhoneDKFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneDKFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_DK);
    }

}
