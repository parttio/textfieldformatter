package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.kw.js")
public class PhoneKWFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneKWFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_KW);
    }

}
