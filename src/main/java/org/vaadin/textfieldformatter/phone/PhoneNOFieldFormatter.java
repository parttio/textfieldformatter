package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.no.js")
public class PhoneNOFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneNOFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_NO);
    }

}
