package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ie.js")
public class PhoneIEFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneIEFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_IE);
    }

}
