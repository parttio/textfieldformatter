package org.vaadin.textfieldformatter;

import com.vaadin.ui.Component;
import com.vaadin.ui.TextField;

import org.vaadin.addonhelpers.AbstractTest;

public class BasicJavaScriptComponentUsageUI extends AbstractTest {

    public static final String INITIAL_VALUE = "Foo!";

    @Override
    public Component getTestComponent() {
        TextField tf = new TextField();
        new TextFieldFormatterExtension(tf);
        return tf;
    }


}
