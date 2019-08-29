package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.bh.js")
public class PhoneBHFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBHFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BH);
    }

}
