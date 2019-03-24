package org.vaadin.textfieldformatter;

import com.vaadin.flow.component.textfield.TextField;

public class NumeralFieldFormatter extends CleaveExtension {
	public static String DEFAULT_DELIMITER = ",";
	public static int DEFAULT_DECIMAL_SCALE = 2;
	public static String DEFAULT_DECIMAL_MARK = ".";
	private static int UNDEFINED_INTEGER_SCALE = -1;

	/**
	 * Creates a TextFieldFormatter for numeral fields. By default has delimiter ','
	 * and decimal mark '.'. Integer scale is not limited and shows 2 decimals.
	 */
	public NumeralFieldFormatter() {
		this(DEFAULT_DELIMITER, DEFAULT_DECIMAL_MARK, UNDEFINED_INTEGER_SCALE, DEFAULT_DECIMAL_SCALE, false);
	}

	public NumeralFieldFormatter(String delimiter, String decimalMark, int decimalScale) {
		this(delimiter, decimalMark, UNDEFINED_INTEGER_SCALE, decimalScale, false);
	}

	/**
	 * Creates a field formatter for numeral fields.
	 *
	 * @param delimiter
	 *            Delimiter for integer groups
	 * @param decimalMark
	 *            Delimiter for decimal
	 * @param integerScale
	 *            Limit the scale of integer i.e. number of digits before decimal
	 * @param decimalScale
	 *            Number of decimals
	 * @param nonNegativeOnly
	 *            True: allow only non-negative numbers. False: Allow negative, 0
	 *            and positive.
	 */
	public NumeralFieldFormatter(String delimiter, String decimalMark, int integerScale, int decimalScale,
			boolean nonNegativeOnly) {
		getConfiguration().numeral = true;
		getConfiguration().delimiter = delimiter;
		getConfiguration().numeralDecimalMark = decimalMark;
		if (integerScale != -1) {
			getConfiguration().numeralIntegerScale = integerScale;
		}
		getConfiguration().numeralDecimalScale = decimalScale;
		getConfiguration().numeralPositiveOnly = nonNegativeOnly;
	}

	/**
	 * Attaches this extension to a TextField. Extension cannot be moved to another
	 * TextField again.
	 * 
	 * @param textField
	 *            TextField to attach this extension to
	 */
	public void extend(TextField textField) {
		super.extend(textField);
	}
}
