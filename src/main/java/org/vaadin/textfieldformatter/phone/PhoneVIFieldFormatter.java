package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.vi.js")
public class PhoneVIFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneVIFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_VI);
    }

}
