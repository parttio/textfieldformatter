package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ch.js")
public class PhoneCHFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCHFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CH);
    }

}
