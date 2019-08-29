package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.do.js")
public class PhoneDOFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneDOFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_DO);
    }

}
