package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.mg.js")
public class PhoneMGFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMGFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MG);
    }

}
