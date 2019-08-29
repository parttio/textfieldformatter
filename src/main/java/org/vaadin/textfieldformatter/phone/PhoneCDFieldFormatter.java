package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.cd.js")
public class PhoneCDFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCDFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CD);
    }

}
