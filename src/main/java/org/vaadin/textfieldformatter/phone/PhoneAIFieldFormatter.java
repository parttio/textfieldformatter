package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ai.js")
public class PhoneAIFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneAIFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_AI);
    }

}
