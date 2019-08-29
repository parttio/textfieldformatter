package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.pk.js")
public class PhonePKFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhonePKFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_PK);
    }

}
