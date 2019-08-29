package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.cw.js")
public class PhoneCWFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCWFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CW);
    }

}
