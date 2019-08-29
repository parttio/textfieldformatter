package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.tw.js")
public class PhoneTWFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneTWFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_TW);
    }

}
