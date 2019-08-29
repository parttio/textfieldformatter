package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.sc.js")
public class PhoneSCFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSCFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SC);
    }

}
