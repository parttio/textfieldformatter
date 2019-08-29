package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.bj.js")
public class PhoneBJFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBJFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BJ);
    }

}
