package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.om.js")
public class PhoneOMFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneOMFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_OM);
    }

}
