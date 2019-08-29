package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.tt.js")
public class PhoneTTFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneTTFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_TT);
    }

}
