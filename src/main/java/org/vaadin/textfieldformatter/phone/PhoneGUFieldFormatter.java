package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.gu.js")
public class PhoneGUFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGUFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GU);
    }

}
