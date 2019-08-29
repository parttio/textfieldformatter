package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.cm.js")
public class PhoneCMFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCMFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CM);
    }

}
