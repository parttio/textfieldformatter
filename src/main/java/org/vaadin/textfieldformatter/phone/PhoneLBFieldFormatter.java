package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.lb.js")
public class PhoneLBFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneLBFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_LB);
    }

}
