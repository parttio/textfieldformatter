package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.mp.js")
public class PhoneMPFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMPFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MP);
    }

}
