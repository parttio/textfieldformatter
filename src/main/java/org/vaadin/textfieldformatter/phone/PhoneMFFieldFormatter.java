package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.mf.js")
public class PhoneMFFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMFFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MF);
    }

}
