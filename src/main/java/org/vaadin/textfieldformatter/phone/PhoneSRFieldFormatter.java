package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.sr.js")
public class PhoneSRFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSRFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_SR);
    }

}
