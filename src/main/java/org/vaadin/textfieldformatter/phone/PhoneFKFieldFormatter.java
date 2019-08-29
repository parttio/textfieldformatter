package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.fk.js")
public class PhoneFKFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneFKFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_FK);
    }

}
