package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.vu.js")
public class PhoneVUFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneVUFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_VU);
    }

}
