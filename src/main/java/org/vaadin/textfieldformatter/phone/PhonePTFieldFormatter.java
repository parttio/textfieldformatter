package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.pt.js")
public class PhonePTFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhonePTFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_PT);
    }

}
