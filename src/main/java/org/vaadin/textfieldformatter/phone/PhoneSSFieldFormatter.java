package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ss.js")
public class PhoneSSFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSSFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SS);
    }

}
