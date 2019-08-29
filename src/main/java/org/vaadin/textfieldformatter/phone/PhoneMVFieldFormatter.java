package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.mv.js")
public class PhoneMVFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMVFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MV);
    }

}
