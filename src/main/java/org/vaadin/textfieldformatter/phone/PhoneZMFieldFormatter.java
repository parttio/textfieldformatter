package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.zm.js")
public class PhoneZMFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneZMFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_ZM);
    }

}
