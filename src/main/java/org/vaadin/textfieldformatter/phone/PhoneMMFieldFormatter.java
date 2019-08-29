package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.mm.js")
public class PhoneMMFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMMFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MM);
    }

}
