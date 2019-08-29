package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.sm.js")
public class PhoneSMFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSMFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SM);
    }

}
