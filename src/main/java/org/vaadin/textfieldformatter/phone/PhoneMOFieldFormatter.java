package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.mo.js")
public class PhoneMOFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMOFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MO);
    }

}
