package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.kr.js")
public class PhoneKRFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneKRFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_KR);
    }

}
