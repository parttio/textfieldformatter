package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.is.js")
public class PhoneISFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneISFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_IS);
    }

}
