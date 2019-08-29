package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.sx.js")
public class PhoneSXFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSXFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SX);
    }

}
