package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.pg.js")
public class PhonePGFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhonePGFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_PG);
    }

}
