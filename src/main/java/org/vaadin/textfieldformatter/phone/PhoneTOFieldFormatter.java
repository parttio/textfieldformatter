package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.to.js")
public class PhoneTOFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneTOFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_TO);
    }

}
