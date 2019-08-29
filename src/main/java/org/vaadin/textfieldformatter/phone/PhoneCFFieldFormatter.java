package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.cf.js")
public class PhoneCFFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCFFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CF);
    }

}
