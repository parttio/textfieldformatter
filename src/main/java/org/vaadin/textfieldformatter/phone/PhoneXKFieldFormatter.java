package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.xk.js")
public class PhoneXKFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneXKFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_XK);
    }

}
