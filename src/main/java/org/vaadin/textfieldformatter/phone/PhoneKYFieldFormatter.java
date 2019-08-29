package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ky.js")
public class PhoneKYFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneKYFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_KY);
    }

}
