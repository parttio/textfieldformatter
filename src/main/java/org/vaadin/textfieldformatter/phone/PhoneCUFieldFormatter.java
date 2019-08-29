package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.cu.js")
public class PhoneCUFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCUFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CU);
    }

}
