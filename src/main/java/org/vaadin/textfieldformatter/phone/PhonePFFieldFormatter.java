package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.pf.js")
public class PhonePFFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhonePFFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_PF);
    }

}
