package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.gd.js")
public class PhoneGDFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGDFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GD);
    }

}
