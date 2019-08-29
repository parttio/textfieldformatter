package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.np.js")
public class PhoneNPFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneNPFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_NP);
    }

}
