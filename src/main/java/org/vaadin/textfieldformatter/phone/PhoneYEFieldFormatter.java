package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ye.js")
public class PhoneYEFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneYEFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_YE);
    }

}
