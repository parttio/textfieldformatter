package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.me.js")
public class PhoneMEFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMEFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_ME);
    }

}
