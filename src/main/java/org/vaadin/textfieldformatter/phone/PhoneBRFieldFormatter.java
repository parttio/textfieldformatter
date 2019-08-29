package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.br.js")
public class PhoneBRFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBRFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BR);
    }

}
