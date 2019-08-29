package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.pa.js")
public class PhonePAFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhonePAFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_PA);
    }

}
