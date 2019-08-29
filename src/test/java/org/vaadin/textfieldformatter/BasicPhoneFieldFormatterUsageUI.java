package org.vaadin.textfieldformatter;

import org.vaadin.textfieldformatter.phone.PhoneLUFieldFormatter;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.TextField;

public class BasicPhoneFieldFormatterUsageUI extends AbstractTest {

	public static final String INITIAL_VALUE = "Foo!";

	@Override
	public Component getTestComponent() {
		TextField tf = new TextField();
		new PhoneLUFieldFormatter().extend(tf);
		tf.addValueChangeListener(l -> Notification.show("Value: " + l.getValue()));
		return tf;
	}

}
