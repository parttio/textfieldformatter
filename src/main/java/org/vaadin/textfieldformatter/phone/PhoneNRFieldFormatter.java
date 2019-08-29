package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.nr.js")
public class PhoneNRFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneNRFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_NR);
    }

}
