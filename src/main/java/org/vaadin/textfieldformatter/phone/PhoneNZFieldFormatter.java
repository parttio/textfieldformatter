package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.nz.js")
public class PhoneNZFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneNZFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_NZ);
    }

}
