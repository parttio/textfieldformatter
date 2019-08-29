package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.bf.js")
public class PhoneBFFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBFFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BF);
    }

}
