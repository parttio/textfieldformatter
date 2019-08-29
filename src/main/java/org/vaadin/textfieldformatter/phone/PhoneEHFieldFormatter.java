package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.eh.js")
public class PhoneEHFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneEHFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_EH);
    }

}
