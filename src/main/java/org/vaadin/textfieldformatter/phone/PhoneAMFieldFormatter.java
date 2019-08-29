package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.am.js")
public class PhoneAMFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneAMFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_AM);
    }

}
