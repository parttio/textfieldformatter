package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.bo.js")
public class PhoneBOFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBOFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BO);
    }

}
