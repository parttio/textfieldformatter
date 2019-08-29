package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.as.js")
public class PhoneASFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneASFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_AS);
    }

}
