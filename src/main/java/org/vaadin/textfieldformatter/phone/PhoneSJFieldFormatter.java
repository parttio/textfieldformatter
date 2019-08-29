package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.sj.js")
public class PhoneSJFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSJFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SJ);
    }

}
