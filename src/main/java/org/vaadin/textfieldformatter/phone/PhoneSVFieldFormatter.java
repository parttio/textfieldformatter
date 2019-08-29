package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.sv.js")
public class PhoneSVFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSVFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SV);
    }

}
