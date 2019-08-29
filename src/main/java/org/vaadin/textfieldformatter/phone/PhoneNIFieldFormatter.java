package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ni.js")
public class PhoneNIFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneNIFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_NI);
    }

}
