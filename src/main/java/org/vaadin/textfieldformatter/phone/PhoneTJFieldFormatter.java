package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.tj.js")
public class PhoneTJFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneTJFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_TJ);
    }

}
