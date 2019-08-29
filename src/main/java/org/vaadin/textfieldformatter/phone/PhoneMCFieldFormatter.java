package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.mc.js")
public class PhoneMCFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMCFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MC);
    }

}
