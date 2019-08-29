package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ve.js")
public class PhoneVEFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneVEFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_VE);
    }

}
