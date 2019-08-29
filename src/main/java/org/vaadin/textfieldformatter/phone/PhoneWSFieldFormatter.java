package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ws.js")
public class PhoneWSFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneWSFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_WS);
    }

}
