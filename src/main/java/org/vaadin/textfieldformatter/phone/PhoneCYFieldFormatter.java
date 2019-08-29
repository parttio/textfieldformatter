package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.cy.js")
public class PhoneCYFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCYFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CY);
    }

}
