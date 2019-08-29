package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.li.js")
public class PhoneLIFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneLIFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_LI);
    }

}
