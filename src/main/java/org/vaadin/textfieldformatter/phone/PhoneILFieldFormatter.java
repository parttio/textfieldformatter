package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.il.js")
public class PhoneILFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneILFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_IL);
    }

}
