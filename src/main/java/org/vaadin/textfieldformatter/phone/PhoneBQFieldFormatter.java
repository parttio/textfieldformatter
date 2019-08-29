package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.bq.js")
public class PhoneBQFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBQFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BQ);
    }

}
