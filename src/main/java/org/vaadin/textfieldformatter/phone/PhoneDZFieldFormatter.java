package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.dz.js")
public class PhoneDZFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneDZFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_DZ);
    }

}
