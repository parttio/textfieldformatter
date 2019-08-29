package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.vc.js")
public class PhoneVCFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneVCFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_VC);
    }

}
