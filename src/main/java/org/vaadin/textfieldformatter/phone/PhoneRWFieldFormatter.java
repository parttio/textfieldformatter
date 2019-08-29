package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.rw.js")
public class PhoneRWFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneRWFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_RW);
    }

}
