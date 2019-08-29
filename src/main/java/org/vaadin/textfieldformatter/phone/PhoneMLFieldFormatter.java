package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ml.js")
public class PhoneMLFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMLFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_ML);
    }

}
