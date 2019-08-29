package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.tm.js")
public class PhoneTMFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneTMFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_TM);
    }

}
