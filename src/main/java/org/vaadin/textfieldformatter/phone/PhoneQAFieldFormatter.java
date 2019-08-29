package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.qa.js")
public class PhoneQAFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneQAFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_QA);
    }

}
