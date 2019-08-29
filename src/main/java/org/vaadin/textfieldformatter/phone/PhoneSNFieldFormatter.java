package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.sn.js")
public class PhoneSNFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSNFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SN);
    }

}
