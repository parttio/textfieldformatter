package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.tl.js")
public class PhoneTLFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneTLFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_TL);
    }

}
