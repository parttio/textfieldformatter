package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.mk.js")
public class PhoneMKFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMKFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MK);
    }

}
