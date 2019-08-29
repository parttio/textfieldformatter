package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.tv.js")
public class PhoneTVFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneTVFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_TV);
    }

}
