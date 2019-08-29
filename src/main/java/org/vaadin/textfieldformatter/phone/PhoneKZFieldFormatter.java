package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.kz.js")
public class PhoneKZFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneKZFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_KZ);
    }

}
