package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.sg.js")
public class PhoneSGFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSGFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SG);
    }

}
