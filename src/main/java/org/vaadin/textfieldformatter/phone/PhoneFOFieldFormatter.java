package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.fo.js")
public class PhoneFOFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneFOFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_FO);
    }

}
