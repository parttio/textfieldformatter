package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.my.js")
public class PhoneMYFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMYFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MY);
    }

}
