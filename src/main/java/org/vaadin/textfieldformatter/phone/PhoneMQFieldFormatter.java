package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.mq.js")
public class PhoneMQFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMQFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MQ);
    }

}
