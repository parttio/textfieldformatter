package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ly.js")
public class PhoneLYFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneLYFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_LY);
    }

}
