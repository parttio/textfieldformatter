package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.cz.js")
public class PhoneCZFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCZFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CZ);
    }

}
