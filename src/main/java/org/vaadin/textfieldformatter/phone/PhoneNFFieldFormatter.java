package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.nf.js")
public class PhoneNFFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneNFFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_NF);
    }

}
