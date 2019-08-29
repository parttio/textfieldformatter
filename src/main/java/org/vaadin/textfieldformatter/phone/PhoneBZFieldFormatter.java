package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.bz.js")
public class PhoneBZFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBZFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BZ);
    }

}
