package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.tk.js")
public class PhoneTKFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneTKFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_TK);
    }

}
