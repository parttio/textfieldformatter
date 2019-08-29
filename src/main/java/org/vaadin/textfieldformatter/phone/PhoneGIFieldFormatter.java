package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.gi.js")
public class PhoneGIFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGIFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GI);
    }

}
