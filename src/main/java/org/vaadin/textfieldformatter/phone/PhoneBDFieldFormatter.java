package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.bd.js")
public class PhoneBDFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBDFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BD);
    }

}
