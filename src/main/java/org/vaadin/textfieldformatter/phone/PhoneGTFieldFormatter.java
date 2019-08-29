package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.gt.js")
public class PhoneGTFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGTFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GT);
    }

}
