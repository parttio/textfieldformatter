package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.gh.js")
public class PhoneGHFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGHFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GH);
    }

}
