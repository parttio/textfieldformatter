package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ki.js")
public class PhoneKIFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneKIFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_KI);
    }

}
