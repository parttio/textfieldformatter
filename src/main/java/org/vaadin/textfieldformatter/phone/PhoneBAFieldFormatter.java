package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ba.js")
public class PhoneBAFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBAFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BA);
    }

}
