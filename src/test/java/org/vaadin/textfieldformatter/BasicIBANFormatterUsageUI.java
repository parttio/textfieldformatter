package org.vaadin.textfieldformatter;

import com.vaadin.ui.Component;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;

import org.vaadin.addonhelpers.AbstractTest;

public class BasicIBANFormatterUsageUI extends AbstractTest {

    public static final String INITIAL_VALUE = "Foo!";

    @Override
    public Component getTestComponent() {
        TextField tf = new TextField();
        IBANFormatter.fromIBANLength(18).extend(tf);
        tf.addValueChangeListener(l -> Notification.show("Value: " + l.getValue()));
        return tf;
    }
}
