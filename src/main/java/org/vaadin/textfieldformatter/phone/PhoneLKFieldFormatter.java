package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.lk.js")
public class PhoneLKFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneLKFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_LK);
    }

}
