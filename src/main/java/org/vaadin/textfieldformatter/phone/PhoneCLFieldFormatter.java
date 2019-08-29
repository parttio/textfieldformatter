package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.cl.js")
public class PhoneCLFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCLFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CL);
    }

}
