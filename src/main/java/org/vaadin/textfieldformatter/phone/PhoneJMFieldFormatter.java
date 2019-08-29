package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.jm.js")
public class PhoneJMFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneJMFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_JM);
    }

}
