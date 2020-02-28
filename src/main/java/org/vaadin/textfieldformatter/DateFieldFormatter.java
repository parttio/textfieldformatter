package org.vaadin.textfieldformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.vaadin.flow.component.textfield.TextField;

public class DateFieldFormatter extends CleaveExtension {

	/**
	 * Creates a field for date input formatting. Day and month must have the
	 * leading zero. A custom delimiter can be defined.
	 * 
	 * @param datePattern String date pattern. Supports yyyy, yy, MM, dd, e.g.
	 *                    ddMMyyyy.
	 * @param dateMin     Minimum allowed date to input (inclusive). Will transform
	 *                    the value to the minimum if input value is earlier date.
	 *                    Default null.
	 * @param dateMax     Maximum date allowed to input (inclusive). Will transform
	 *                    the value to the maximum if input value is later
	 *                    date.Default null.
	 * @param delimiter   Custom delimiter for the values. Default "/".
	 */
	public DateFieldFormatter(String datePattern, LocalDate dateMin, LocalDate dateMax, String delimiter) {

		String pattern = datePattern.replace("yyyy", "Y");
		pattern = pattern.replace("yy", "y");
		pattern = pattern.replace("MM", "m");
		pattern = pattern.replace("dd", "d");

		getConfiguration().date = true;
		getConfiguration().datePattern = pattern.split("");

		if (dateMin != null) {
			getConfiguration().dateMin = dateMin.format(DateTimeFormatter.ISO_LOCAL_DATE);
		}
		if (dateMax != null) {
			getConfiguration().dateMax = dateMax.format(DateTimeFormatter.ISO_LOCAL_DATE);
		}
		if (delimiter != null && !delimiter.isEmpty()) {
			getConfiguration().delimiter = delimiter;
		}
	}

	/**
	 * Attaches this extension to a TextField. Extension cannot be moved to another
	 * TextField again.
	 * 
	 * @param textField TextField to attach this extension to
	 */
	public void extend(TextField textField) {
		super.extend(textField);
	}

	/***
	 * 
	 * Builds a default DateFieldFormatter which formats dates to dd/MM/yyyy without
	 * any minimum or maximum allowed date.
	 */
	public static class Builder {
		private String delimiter = "/";
		private LocalDate dateMin = null;
		private LocalDate dateMax = null;
		private String datePattern = "ddMMyyyy";

		public Builder() {

		}

		/***
		 * 
		 * @param datePattern String date pattern. Supports 'yyyy', 'yy', 'MM', 'dd',
		 *                    e.g. ddMMyyyy.
		 * @return
		 */
		public Builder datePattern(String datePattern) {
			this.datePattern = datePattern;
			return this;
		}

		/***
		 * 
		 * @param dateMin Minimum date to input (inclusive). Default null.
		 * @return
		 */
		public Builder dateMin(LocalDate dateMin) {
			this.dateMin = dateMin;
			return this;
		}

		/***
		 * 
		 * @param dateMax Maximum date to input (inclusive). Default null.
		 * @return
		 */
		public Builder dateMax(LocalDate dateMax) {
			this.dateMax = dateMax;
			return this;
		}

		/**
		 * 
		 * @param delimiter Custom delimiter for the values. Default "/".
		 * @return
		 */
		public Builder delimiter(String delimiter) {
			this.delimiter = delimiter;
			return this;
		}

		public DateFieldFormatter build() {
			return new DateFieldFormatter(datePattern, dateMin, dateMax, delimiter);
		}
	}
}
