package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.hn.js")
public class PhoneHNFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneHNFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_HN);
    }

}
