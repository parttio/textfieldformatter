package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.bs.js")
public class PhoneBSFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBSFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BS);
    }

}
