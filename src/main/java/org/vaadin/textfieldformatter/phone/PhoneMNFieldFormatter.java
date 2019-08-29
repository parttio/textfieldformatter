package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.mn.js")
public class PhoneMNFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMNFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MN);
    }

}
