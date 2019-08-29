package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ms.js")
public class PhoneMSFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMSFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MS);
    }

}
