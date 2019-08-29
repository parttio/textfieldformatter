package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.af.js")
public class PhoneAFFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneAFFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_AF);
    }

}
