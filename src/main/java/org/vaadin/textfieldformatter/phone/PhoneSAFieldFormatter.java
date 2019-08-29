package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.sa.js")
public class PhoneSAFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSAFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SA);
    }

}
