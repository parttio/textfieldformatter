package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ne.js")
public class PhoneNEFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneNEFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_NE);
    }

}
