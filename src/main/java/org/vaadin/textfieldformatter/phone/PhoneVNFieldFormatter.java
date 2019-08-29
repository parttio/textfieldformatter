package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.vn.js")
public class PhoneVNFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneVNFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_VN);
    }

}
