package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.rs.js")
public class PhoneRSFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneRSFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_RS);
    }

}
