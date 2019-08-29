package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.md.js")
public class PhoneMDFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMDFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MD);
    }

}
