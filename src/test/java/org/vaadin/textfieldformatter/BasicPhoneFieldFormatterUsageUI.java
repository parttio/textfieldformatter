package org.vaadin.textfieldformatter;

import org.vaadin.addonhelpers.AbstractTest;

import com.vaadin.ui.Component;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;

public class BasicPhoneFieldFormatterUsageUI extends AbstractTest {

	public static final String INITIAL_VALUE = "Foo!";

	@Override
	public Component getTestComponent() {
		TextField tf = new TextField();
		new PhoneFieldFormatter("LU").extend(tf);
        tf.addValueChangeListener(l -> Notification.show("Value: " + l.getValue()));
		return tf;
	}

}
