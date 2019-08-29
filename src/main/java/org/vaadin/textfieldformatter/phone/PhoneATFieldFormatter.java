package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.at.js")
public class PhoneATFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneATFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_AT);
    }

}
