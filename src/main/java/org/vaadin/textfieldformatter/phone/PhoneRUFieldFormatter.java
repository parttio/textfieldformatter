package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ru.js")
public class PhoneRUFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneRUFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_RU);
    }

}
