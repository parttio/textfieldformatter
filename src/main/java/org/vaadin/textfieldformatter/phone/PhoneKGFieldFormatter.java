package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.kg.js")
public class PhoneKGFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneKGFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_KG);
    }

}
