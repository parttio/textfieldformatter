package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.si.js")
public class PhoneSIFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSIFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SI);
    }

}
