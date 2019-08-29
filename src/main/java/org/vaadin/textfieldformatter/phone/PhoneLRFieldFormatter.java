package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.lr.js")
public class PhoneLRFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneLRFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_LR);
    }

}
