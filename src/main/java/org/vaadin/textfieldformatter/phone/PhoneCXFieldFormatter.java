package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.cx.js")
public class PhoneCXFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCXFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CX);
    }

}
