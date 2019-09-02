package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.kp.js")
public class PhoneKPFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneKPFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_KP);
    }

}