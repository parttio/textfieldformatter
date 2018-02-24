package org.vaadin.textfieldformatter;

import org.vaadin.addonhelpers.AbstractTest;

import com.vaadin.ui.Component;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;

public class CustomNumeralFieldFormatterUsageUI extends AbstractTest {

	@Override
	public Component getTestComponent() {
		TextField tf = new TextField();
		new NumeralFieldFormatter(".", ",", -1, 3, true).extend(tf);
		tf.addValueChangeListener(l -> Notification.show("Value: " + l.getValue()));
		return tf;
	}

}
