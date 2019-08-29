package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.dm.js")
public class PhoneDMFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneDMFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_DM);
    }

}
