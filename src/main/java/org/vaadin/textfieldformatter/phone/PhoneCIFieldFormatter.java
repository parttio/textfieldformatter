package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ci.js")
public class PhoneCIFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCIFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CI);
    }

}
