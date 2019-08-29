package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.st.js")
public class PhoneSTFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneSTFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_ST);
    }

}
