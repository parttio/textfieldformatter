package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.th.js")
public class PhoneTHFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneTHFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_TH);
    }

}
