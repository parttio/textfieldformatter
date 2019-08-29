package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ad.js")
public class PhoneADFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneADFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_AD);
    }

}
