package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.mz.js")
public class PhoneMZFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMZFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MZ);
    }

}
