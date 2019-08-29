package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.tz.js")
public class PhoneTZFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneTZFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_TZ);
    }

}
