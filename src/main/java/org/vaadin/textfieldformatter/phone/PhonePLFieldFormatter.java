package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.pl.js")
public class PhonePLFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhonePLFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_PL);
    }

}
