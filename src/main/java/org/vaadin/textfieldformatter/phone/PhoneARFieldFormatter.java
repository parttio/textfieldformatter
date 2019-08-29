package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ar.js")
public class PhoneARFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneARFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_AR);
    }

}
