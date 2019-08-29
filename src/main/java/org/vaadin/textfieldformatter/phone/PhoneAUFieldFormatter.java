package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.au.js")
public class PhoneAUFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneAUFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_AU);
    }

}
