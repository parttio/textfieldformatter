package org.vaadin.textfieldformatter;

import org.vaadin.textfieldformatter.BasicIBANFormatterUsageUI.BasicIBAN;
import org.vaadin.textfieldformatter.BasicIBANFormatterUsageUI.ReplaceIBAN;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.TextField;

@RouteParams( { BasicIBAN.class, ReplaceIBAN.class })
public class BasicIBANFormatterUsageUI extends AbstractTest {

	@Override
	public Component getTestComponent(UITestConfiguration configuration) {
		return configuration.getTestComponent();
	}

	public static class BasicIBAN extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();
			IBANFormatter.fromIBANLength(18).extend(tf);
			tf.addValueChangeListener(l -> Notification.show("Value: " + l.getValue()));
			return tf;
		}

	}

	public static class ReplaceIBAN extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();
			IBANFormatter formatter = IBANFormatter.fromIBANLength(18);
			formatter.extend(tf);
			formatter.remove();
			IBANFormatter.fromIBANLength(22).extend(tf);
			return tf;
		}

	}
}
