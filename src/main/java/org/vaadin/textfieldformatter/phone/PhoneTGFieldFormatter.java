package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.tg.js")
public class PhoneTGFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneTGFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_TG);
    }

}
