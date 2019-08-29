package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.lv.js")
public class PhoneLVFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneLVFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_LV);
    }

}
