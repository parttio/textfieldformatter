package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.bt.js")
public class PhoneBTFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBTFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BT);
    }

}
