package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.va.js")
public class PhoneVAFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneVAFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_VA);
    }

}
