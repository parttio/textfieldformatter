package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.it.js")
public class PhoneITFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneITFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_IT);
    }

}
