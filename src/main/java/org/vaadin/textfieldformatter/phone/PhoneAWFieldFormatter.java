package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.aw.js")
public class PhoneAWFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneAWFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_AW);
    }

}
