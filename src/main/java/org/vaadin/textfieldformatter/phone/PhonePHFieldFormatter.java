package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ph.js")
public class PhonePHFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhonePHFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_PH);
    }

}
