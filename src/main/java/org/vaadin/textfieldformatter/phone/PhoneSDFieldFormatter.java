package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.sd.js")
public class PhoneSDFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSDFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SD);
    }

}
