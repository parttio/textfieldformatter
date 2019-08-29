package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.cv.js")
public class PhoneCVFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCVFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CV);
    }

}
