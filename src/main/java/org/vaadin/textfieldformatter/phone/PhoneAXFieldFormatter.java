package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ax.js")
public class PhoneAXFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneAXFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_AX);
    }

}
