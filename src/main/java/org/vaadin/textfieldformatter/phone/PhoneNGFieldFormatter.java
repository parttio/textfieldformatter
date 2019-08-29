package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ng.js")
public class PhoneNGFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneNGFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_NG);
    }

}
