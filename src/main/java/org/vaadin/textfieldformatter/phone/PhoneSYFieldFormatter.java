package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.sy.js")
public class PhoneSYFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSYFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SY);
    }

}
