package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.fj.js")
public class PhoneFJFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneFJFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_FJ);
    }

}
