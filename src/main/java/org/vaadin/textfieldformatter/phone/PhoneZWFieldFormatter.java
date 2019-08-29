package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.zw.js")
public class PhoneZWFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneZWFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_ZW);
    }

}
