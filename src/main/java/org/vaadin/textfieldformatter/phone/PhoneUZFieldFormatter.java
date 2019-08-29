package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.uz.js")
public class PhoneUZFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneUZFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_UZ);
    }

}
