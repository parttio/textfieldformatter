package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.je.js")
public class PhoneJEFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneJEFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_JE);
    }

}
