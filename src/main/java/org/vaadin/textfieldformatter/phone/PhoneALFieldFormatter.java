package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.al.js")
public class PhoneALFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneALFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_AL);
    }

}
