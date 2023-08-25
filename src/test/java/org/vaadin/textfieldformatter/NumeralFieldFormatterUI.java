package org.vaadin.textfieldformatter;

import org.vaadin.textfieldformatter.NumeralFieldFormatter.ThousandsGroupStyle;
import org.vaadin.textfieldformatter.NumeralFieldFormatterUI.CustomValue;
import org.vaadin.textfieldformatter.NumeralFieldFormatterUI.DecimalMark;
import org.vaadin.textfieldformatter.NumeralFieldFormatterUI.DecimalScale;
import org.vaadin.textfieldformatter.NumeralFieldFormatterUI.DefaultValues;
import org.vaadin.textfieldformatter.NumeralFieldFormatterUI.DontStripLeadingZeroes;
import org.vaadin.textfieldformatter.NumeralFieldFormatterUI.IntegerScale;
import org.vaadin.textfieldformatter.NumeralFieldFormatterUI.PositiveOnly;
import org.vaadin.textfieldformatter.NumeralFieldFormatterUI.SignBeforePrefix;
import org.vaadin.textfieldformatter.NumeralFieldFormatterUI.Postfix;
import org.vaadin.textfieldformatter.NumeralFieldFormatterUI.ThousandsGroupLakh;
import org.vaadin.textfieldformatter.NumeralFieldFormatterUI.ThousandsGroupNone;
import org.vaadin.textfieldformatter.NumeralFieldFormatterUI.ThousandsGroupThousand;
import org.vaadin.textfieldformatter.NumeralFieldFormatterUI.ThousandsGroupWan;
import org.vaadin.textfieldformatter.NumeralFieldFormatterUI.BinderRequiredValidation;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.value.ValueChangeMode;

@RouteParams({ DefaultValues.class, CustomValue.class, ThousandsGroupThousand.class, ThousandsGroupLakh.class,
		ThousandsGroupWan.class, ThousandsGroupNone.class, IntegerScale.class, DecimalScale.class, DecimalMark.class,
		PositiveOnly.class, SignBeforePrefix.class, Postfix.class, DontStripLeadingZeroes.class,
		BinderRequiredValidation.class})
public class NumeralFieldFormatterUI extends AbstractTest {

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
			new NumeralFieldFormatter.Builder().delimiter(" ").decimalMark(",").decimalScale(3).prefix("€")
					.signBeforePrefix(true).build().extend(tf);
			return tf;
		}

	}

	public static class ThousandsGroupThousand extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();
			new NumeralFieldFormatter.Builder().thousandsGroupStyle(ThousandsGroupStyle.THOUSAND).build().extend(tf);
			return tf;
		}

	}

	public static class ThousandsGroupLakh extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();
			new NumeralFieldFormatter.Builder().thousandsGroupStyle(ThousandsGroupStyle.LAKH).build().extend(tf);
			return tf;
		}

	}

	public static class ThousandsGroupWan extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();
			new NumeralFieldFormatter.Builder().thousandsGroupStyle(ThousandsGroupStyle.WAN).build().extend(tf);
			return tf;
		}

	}

	public static class ThousandsGroupNone extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();
			new NumeralFieldFormatter.Builder().thousandsGroupStyle(ThousandsGroupStyle.NONE).build().extend(tf);
			return tf;
		}

	}

	public static class IntegerScale extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();
			new NumeralFieldFormatter.Builder().integerScale(5).decimalScale(2).build().extend(tf);
			return tf;
		}

	}

	public static class DecimalScale extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();
			new NumeralFieldFormatter(".", ",", 6).extend(tf);
			return tf;
		}

	}

	public static class DecimalMark extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();
			new NumeralFieldFormatter.Builder().decimalMark(",").build().extend(tf);
			return tf;
		}

	}

	public static class PositiveOnly extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();
			new NumeralFieldFormatter.Builder().nonNegativeOnly(true).build().extend(tf);
			return tf;
		}

	}

	public static class SignBeforePrefix extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();
			new NumeralFieldFormatter.Builder().prefix("€").signBeforePrefix(true).build().extend(tf);
			return new VerticalLayout(tf, new TextField("Here"));
		}

	}

	public static class Postfix extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();
			new NumeralFieldFormatter.Builder().prefix("€", true).build().extend(tf);
			return tf;
		}

	}

	public static class DontStripLeadingZeroes extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();
			new NumeralFieldFormatter.Builder().stripLeadingZeroes(false).build().extend(tf);
			return tf;
		}

	}

	public static class BinderRequiredValidation extends UITestConfiguration {

		private String value;

		@Override
		public Component getTestComponent() {
			TextField tf = new TextField();
			tf.setValueChangeMode(ValueChangeMode.EAGER);
			tf.addValueChangeListener(l -> Notification.show("Value: " + l.getValue()));

			final NumeralFieldFormatter numeralFieldFormatter = new NumeralFieldFormatter();
			numeralFieldFormatter.extend(tf);

			tf.addValueChangeListener(l ->
					numeralFieldFormatter.getRawValue(rawValue -> Notification.show("Raw value: " + rawValue))
			);

			Binder<BinderRequiredValidation> binder = new Binder<>();
			binder.forField(tf)
					.asRequired("This value is required")
					.bind(BinderRequiredValidation::getValue, BinderRequiredValidation::setValue);

			return tf;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}
}
