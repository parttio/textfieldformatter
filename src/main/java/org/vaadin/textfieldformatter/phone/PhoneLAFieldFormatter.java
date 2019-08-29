package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.la.js")
public class PhoneLAFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneLAFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_LA);
    }

}
