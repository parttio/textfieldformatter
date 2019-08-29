package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ta.js")
public class PhoneTAFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneTAFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_TA);
    }

}
