package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.hr.js")
public class PhoneHRFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneHRFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_HR);
    }

}
