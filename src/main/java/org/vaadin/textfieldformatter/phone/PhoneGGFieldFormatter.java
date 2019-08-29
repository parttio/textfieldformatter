package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.gg.js")
public class PhoneGGFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGGFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GG);
    }

}
