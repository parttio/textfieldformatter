package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.sh.js")
public class PhoneSHFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSHFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SH);
    }

}
