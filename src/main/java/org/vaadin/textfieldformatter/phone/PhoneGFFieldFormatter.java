package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.gf.js")
public class PhoneGFFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGFFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GF);
    }

}
