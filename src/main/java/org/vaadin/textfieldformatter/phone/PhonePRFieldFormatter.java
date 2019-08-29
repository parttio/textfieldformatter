package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.pr.js")
public class PhonePRFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhonePRFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_PR);
    }

}
