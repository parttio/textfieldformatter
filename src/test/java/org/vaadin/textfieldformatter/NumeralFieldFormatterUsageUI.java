package org.vaadin.textfieldformatter;

import com.vaadin.ui.Component;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;

public class NumeralFieldFormatterUsageUI extends AbstractTest {

	@Override
	public Component getTestComponent(UITestConfiguration configuration) {
		return configuration.getTestComponent();
	}

	public static class DefaultValues extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();
			new NumeralFieldFormatter().extend(tf);
			tf.addValueChangeListener(l -> Notification.show("Value: " + l.getValue()));
			return tf;
		}

	}

	public static class CustomValue extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();
			new NumeralFieldFormatter(".", ",", -1, 3, true).extend(tf);
			tf.addValueChangeListener(l -> Notification.show("Value: " + l.getValue()));
			return tf;
		}

	}

	public static class ThousandsGroupThousand extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();

			return tf;
		}

	}
	
	public static class ThousandsGroupLakh extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();

			return tf;
		}

	}
	
	public static class ThousandsGroupWan extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();

			return tf;
		}

	}
	
	public static class ThousandsGroupNone extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();

			return tf;
		}

	}

	public static class IntegerScale extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();

			return tf;
		}

	}

	public static class DecimalScale extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();

			return tf;
		}

	}

	public static class DecimalMark extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();

			return tf;
		}

	}

	public static class PositiveOnly extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();

			return tf;
		}

	}

	public static class SignBeforePrefix extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();

			return tf;
		}

	}

	public static class StripLeadingZeroes extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();

			return tf;
		}

	}
}
