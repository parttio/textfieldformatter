package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.yt.js")
public class PhoneYTFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneYTFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_YT);
    }

}
