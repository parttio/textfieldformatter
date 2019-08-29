package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.cn.js")
public class PhoneCNFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCNFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CN);
    }

}
