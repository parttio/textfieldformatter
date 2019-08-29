package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.bb.js")
public class PhoneBBFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBBFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BB);
    }

}
