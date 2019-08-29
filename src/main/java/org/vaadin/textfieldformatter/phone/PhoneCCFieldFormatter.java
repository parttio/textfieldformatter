package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.cc.js")
public class PhoneCCFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCCFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CC);
    }

}
