package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.bm.js")
public class PhoneBMFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneBMFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_BM);
    }

}
