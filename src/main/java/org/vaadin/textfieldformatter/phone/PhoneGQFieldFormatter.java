package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.gq.js")
public class PhoneGQFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGQFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GQ);
    }

}
