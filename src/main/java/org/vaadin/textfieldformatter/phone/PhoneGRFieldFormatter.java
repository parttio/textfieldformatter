package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.gr.js")
public class PhoneGRFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGRFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GR);
    }

}
