package org.vaadin.textfieldformatter;

import org.vaadin.addonhelpers.AbstractTest;

import com.vaadin.ui.Component;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;

public class BasicCreditCardFieldFormatterUsageUI extends AbstractTest {

	public static final String INITIAL_VALUE = "Foo!";

	@Override
	public Component getTestComponent() {
		TextField tf = new TextField();
		CreditCardFieldFormatter formatter = new CreditCardFieldFormatter();
		formatter.extend(tf);
		formatter.addCreditCardChangedListener(l -> Notification.show("Card type: " + l.getCreditCardType()));
		return tf;
	}

}
