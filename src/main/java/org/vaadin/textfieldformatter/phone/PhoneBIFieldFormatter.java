package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.bi.js")
public class PhoneBIFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBIFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BI);
    }

}
