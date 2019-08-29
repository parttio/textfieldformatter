package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ke.js")
public class PhoneKEFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneKEFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_KE);
    }

}
