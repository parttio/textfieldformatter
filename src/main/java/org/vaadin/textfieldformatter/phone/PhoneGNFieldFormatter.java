package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.gn.js")
public class PhoneGNFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGNFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GN);
    }

}
