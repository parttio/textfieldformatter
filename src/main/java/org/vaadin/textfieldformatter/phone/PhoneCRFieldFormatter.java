package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.cr.js")
public class PhoneCRFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCRFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CR);
    }

}
