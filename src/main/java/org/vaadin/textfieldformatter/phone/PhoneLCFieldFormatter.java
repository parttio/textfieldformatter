package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.lc.js")
public class PhoneLCFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneLCFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_LC);
    }

}
