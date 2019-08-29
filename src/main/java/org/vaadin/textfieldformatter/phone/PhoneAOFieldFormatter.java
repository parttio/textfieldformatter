package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ao.js")
public class PhoneAOFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneAOFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_AO);
    }

}
