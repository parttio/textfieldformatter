package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.jp.js")
public class PhoneJPFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneJPFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_JP);
    }

}
