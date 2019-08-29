package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.au-cn.js")
public class PhoneAUCNFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneAUCNFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_AU_CN);
    }

}
