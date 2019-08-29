package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.py.js")
public class PhonePYFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhonePYFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_PY);
    }

}
