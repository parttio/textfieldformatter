package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.za.js")
public class PhoneZAFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneZAFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_ZA);
    }

}
