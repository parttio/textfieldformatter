package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.cg.js")
public class PhoneCGFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneCGFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_CG);
    }

}
