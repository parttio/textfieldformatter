package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.fr.js")
public class PhoneFRFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneFRFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_FR);
    }

}
