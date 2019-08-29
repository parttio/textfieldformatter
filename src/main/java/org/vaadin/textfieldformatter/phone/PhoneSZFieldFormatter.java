package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.sz.js")
public class PhoneSZFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSZFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SZ);
    }

}
