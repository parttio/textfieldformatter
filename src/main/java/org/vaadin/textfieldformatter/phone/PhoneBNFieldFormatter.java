package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.bn.js")
public class PhoneBNFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBNFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BN);
    }

}
