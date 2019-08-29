package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.az.js")
public class PhoneAZFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneAZFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_AZ);
    }

}
