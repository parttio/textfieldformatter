package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.km.js")
public class PhoneKMFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneKMFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_KM);
    }

}
