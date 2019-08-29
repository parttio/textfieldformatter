package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.lt.js")
public class PhoneLTFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneLTFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_LT);
    }

}
