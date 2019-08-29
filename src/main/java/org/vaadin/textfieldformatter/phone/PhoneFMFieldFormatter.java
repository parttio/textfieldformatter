package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.fm.js")
public class PhoneFMFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneFMFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_FM);
    }

}
