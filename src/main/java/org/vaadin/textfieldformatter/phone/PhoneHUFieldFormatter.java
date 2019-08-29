package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.hu.js")
public class PhoneHUFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneHUFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_HU);
    }

}
