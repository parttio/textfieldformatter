package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.lu.js")
public class PhoneLUFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneLUFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_LU);
    }

}
