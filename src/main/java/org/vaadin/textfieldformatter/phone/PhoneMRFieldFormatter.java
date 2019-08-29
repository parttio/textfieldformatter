package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.mr.js")
public class PhoneMRFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMRFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MR);
    }

}
