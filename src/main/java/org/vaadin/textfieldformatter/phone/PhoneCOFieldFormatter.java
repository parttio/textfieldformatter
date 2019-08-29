package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.co.js")
public class PhoneCOFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCOFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CO);
    }

}
