package org.vaadin.textfieldformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.vaadin.ui.AbstractTextField;

public class DateFieldFormatter extends CleaveExtension {

	/**
	 * Creates a field for date input formatting. Day and month must have the
	 * leading zero. A custom delimiter can be defined.
	 * 
	 * @param datePattern String date pattern. Supports yyyy, yy, MM, dd, e.g.
	 *                    ddMMyyyy.
	 * @param dateMin     Minimum date to input (inclusive). Default null.
	 * @param dateMax     Maximum date to input (inclusive). Default null.
	 * @param delimiter   Custom delimiter for the values. Default "/".
	 */
	public DateFieldFormatter(String datePattern, LocalDate dateMin, LocalDate dateMax, String delimiter) {

		String pattern = datePattern.replace("yyyy", "Y");
		pattern = pattern.replace("yy", "y");
		pattern = pattern.replace("MM", "m");
		pattern = pattern.replace("dd", "d");

		getState().datePattern = pattern.split("");

		if (dateMin != null) {
			getState().dateMin = dateMin.format(DateTimeFormatter.ISO_LOCAL_DATE);
		}
		if (dateMax != null) {
			getState().dateMax = dateMax.format(DateTimeFormatter.ISO_LOCAL_DATE);
		}
		if (delimiter != null && !delimiter.isEmpty()) {
			getState().delimiter = delimiter;
		}
	}

	/**
	 * Adds this extension to a TextField. Extension cannot be moved to another
	 * TextField again.
	 * 
	 * @param textField TextField to attach this extension to
	 */
	public void extend(AbstractTextField textField) {
		super.extend(textField);
	}

	protected DateFieldFormatterState getState() {
		return (DateFieldFormatterState) super.getState();
	}

	public static class Builder {
		private String delimiter = "/";
		private LocalDate dateMin = null;
		private LocalDate dateMax = null;
		private String datePattern = "ddMMyyyy";

		public Builder() {

		}

		/***
		 * 
		 * @param datePattern String date pattern. Supports 'yyyy', 'yy', 'MM', 'dd', e.g.
		 *                    ddMMyyyy.
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
