package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.sb.js")
public class PhoneSBFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSBFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SB);
    }

}
