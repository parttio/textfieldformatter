package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.tc.js")
public class PhoneTCFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneTCFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_TC);
    }

}
