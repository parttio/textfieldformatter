package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.tn.js")
public class PhoneTNFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneTNFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_TN);
    }

}
