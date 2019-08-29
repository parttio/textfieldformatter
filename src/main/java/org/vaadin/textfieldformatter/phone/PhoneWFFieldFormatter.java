package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.wf.js")
public class PhoneWFFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneWFFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_WF);
    }

}
