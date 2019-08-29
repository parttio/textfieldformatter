package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.eg.js")
public class PhoneEGFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneEGFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_EG);
    }

}
