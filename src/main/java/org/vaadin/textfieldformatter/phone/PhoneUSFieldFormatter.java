package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.us.js")
public class PhoneUSFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneUSFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_US);
    }

}
