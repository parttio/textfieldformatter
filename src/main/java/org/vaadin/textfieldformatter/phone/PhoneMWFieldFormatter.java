package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.mw.js")
public class PhoneMWFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMWFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MW);
    }

}
