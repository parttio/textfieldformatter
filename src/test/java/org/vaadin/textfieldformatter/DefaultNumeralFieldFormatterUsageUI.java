package org.vaadin.textfieldformatter;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.TextField;

public class DefaultNumeralFieldFormatterUsageUI extends AbstractTest {

	@Override
	public Component getTestComponent() {
		TextField tf = new TextField();
		new NumeralFieldFormatter().extend(tf);
		tf.addValueChangeListener(l -> Notification.show("Value: " + l.getValue()));
		return tf;
	}

}
