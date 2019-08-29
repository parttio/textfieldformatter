package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.im.js")
public class PhoneIMFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneIMFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_IM);
    }

}
