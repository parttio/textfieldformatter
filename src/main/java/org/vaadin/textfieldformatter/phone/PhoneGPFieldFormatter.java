package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.gp.js")
public class PhoneGPFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGPFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GP);
    }

}
