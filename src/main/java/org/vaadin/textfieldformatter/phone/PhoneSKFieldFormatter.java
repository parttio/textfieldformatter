package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.sk.js")
public class PhoneSKFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSKFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SK);
    }

}
