package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.fi.js")
public class PhoneFIFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneFIFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_FI);
    }

}
