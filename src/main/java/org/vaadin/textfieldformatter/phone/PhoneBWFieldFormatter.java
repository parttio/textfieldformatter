package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.bw.js")
public class PhoneBWFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBWFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BW);
    }

}
