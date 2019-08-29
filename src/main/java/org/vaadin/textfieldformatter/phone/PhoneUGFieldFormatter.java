package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ug.js")
public class PhoneUGFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneUGFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_UG);
    }

}
