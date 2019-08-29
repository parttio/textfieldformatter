package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.gl.js")
public class PhoneGLFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneGLFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_GL);
    }

}
