package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ua.js")
public class PhoneUAFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneUAFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_UA);
    }

}
