package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.na.js")
public class PhoneNAFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneNAFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_NA);
    }

}
