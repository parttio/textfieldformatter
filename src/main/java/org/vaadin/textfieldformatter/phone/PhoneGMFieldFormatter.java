package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.gm.js")
public class PhoneGMFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGMFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GM);
    }

}
