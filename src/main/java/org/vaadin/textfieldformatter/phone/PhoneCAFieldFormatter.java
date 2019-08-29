package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ca.js")
public class PhoneCAFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCAFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CA);
    }

}
