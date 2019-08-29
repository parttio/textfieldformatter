package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.uy.js")
public class PhoneUYFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneUYFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_UY);
    }

}
