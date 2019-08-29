package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.re.js")
public class PhoneREFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneREFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_RE);
    }

}
