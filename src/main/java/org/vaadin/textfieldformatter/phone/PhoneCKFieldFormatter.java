package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ck.js")
public class PhoneCKFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCKFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CK);
    }

}
