package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.id.js")
public class PhoneIDFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneIDFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_ID);
    }

}
