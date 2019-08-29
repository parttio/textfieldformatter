package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.mh.js")
public class PhoneMHFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMHFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MH);
    }

}
