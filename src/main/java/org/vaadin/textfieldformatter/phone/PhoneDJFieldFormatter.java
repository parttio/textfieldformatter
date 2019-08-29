package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.dj.js")
public class PhoneDJFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneDJFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_DJ);
    }

}
