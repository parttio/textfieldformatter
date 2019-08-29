package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.td.js")
public class PhoneTDFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneTDFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_TD);
    }

}
