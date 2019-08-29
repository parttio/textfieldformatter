package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.io.js")
public class PhoneIOFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneIOFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_IO);
    }

}
