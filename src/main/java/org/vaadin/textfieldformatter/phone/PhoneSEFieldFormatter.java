package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.se.js")
public class PhoneSEFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSEFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SE);
    }

}
