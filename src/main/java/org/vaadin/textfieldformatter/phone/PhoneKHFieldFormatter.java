package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.kh.js")
public class PhoneKHFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneKHFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_KH);
    }

}
