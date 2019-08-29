package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.sl.js")
public class PhoneSLFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSLFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SL);
    }

}
