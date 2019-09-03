package org.vaadin.textfieldformatter;

import java.time.LocalDate;

import com.vaadin.ui.Component;
import com.vaadin.ui.TextField;

public class DateFieldFormatterUI extends AbstractTest {

	public static class Max extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField field = new TextField();
			new DateFieldFormatter.Builder().dateMax(LocalDate.of(2019, 2, 3)).build().extend(field);
			return field;
		}
	}

	public static class Min extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField field = new TextField();
			new DateFieldFormatter.Builder().dateMin(LocalDate.of(2019, 2, 4)).build().extend(field);
			return field;
		}
	}

	public static class MinMax extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField field = new TextField();
			new DateFieldFormatter.Builder().dateMax(LocalDate.of(2019, 2, 4)).dateMin(LocalDate.of(2019, 2, 4)).build()
					.extend(field);
			return field;
		}

	}

	public static class FinnishDate extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField field = new TextField();
			new DateFieldFormatter.Builder().datePattern("ddMMyyyy").delimiter(".").build().extend(field);
			return field;
		}

	}

	public static class AmericanDate extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField field = new TextField();
			new DateFieldFormatter.Builder().datePattern("MMddyyyy").build().extend(field);
			return field;
		}

	}

	public static class MonthYear extends UITestConfiguration {

		@Override
		public Component getTestComponent() {
			TextField field = new TextField();
			new DateFieldFormatter.Builder().datePattern("MMyyyy").build().extend(field);
			return field;
		}

	}

	@Override
	public Component getTestComponent(UITestConfiguration configuration) {
		return configuration.getTestComponent();
	}

}
