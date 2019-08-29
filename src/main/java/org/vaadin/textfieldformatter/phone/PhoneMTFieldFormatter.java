package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.mt.js")
public class PhoneMTFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMTFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MT);
    }

}
