package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.et.js")
public class PhoneETFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneETFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_ET);
    }

}
