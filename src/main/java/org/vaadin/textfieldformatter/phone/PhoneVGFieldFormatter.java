package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.vg.js")
public class PhoneVGFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneVGFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_VG);
    }

}
