package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.tr.js")
public class PhoneTRFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneTRFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_TR);
    }

}
