package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.es.js")
public class PhoneESFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneESFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_ES);
    }

}
