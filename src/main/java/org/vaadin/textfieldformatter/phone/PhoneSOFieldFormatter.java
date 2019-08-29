package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.so.js")
public class PhoneSOFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSOFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SO);
    }

}
