package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.hk.js")
public class PhoneHKFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneHKFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_HK);
    }

}
