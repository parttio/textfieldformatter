package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.jo.js")
public class PhoneJOFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneJOFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_JO);
    }

}
