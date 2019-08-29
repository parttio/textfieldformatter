package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.kn.js")
public class PhoneKNFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneKNFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_KN);
    }

}
