package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ps.js")
public class PhonePSFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhonePSFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_PS);
    }

}
