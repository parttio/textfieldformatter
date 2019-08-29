package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.bl.js")
public class PhoneBLFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBLFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BL);
    }

}
