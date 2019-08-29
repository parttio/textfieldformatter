package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ht.js")
public class PhoneHTFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneHTFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_HT);
    }

}
