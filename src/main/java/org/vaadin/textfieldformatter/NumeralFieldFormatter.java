package org.vaadin.textfieldformatter;

import com.vaadin.ui.AbstractTextField;

public class NumeralFieldFormatter extends AbstractTextFieldFormatterExtension {
	public static String DEFAULT_DELIMITER = ",";
	public static int DEFAULT_DECIMAL_SCALE = 2;
	public static String DEFAULT_DECIMAL_MARK = ".";
	private static int UNDEFINED_INTEGER_SCALE = -1;

	/**
	 * Creates a TextFieldFormatter for numeral fields. By default has delimiter
	 * ',' and decimal mark '.'. Integer scale is not limited and shows 2
	 * decimals.
	 *
	 * @param field
	 */
	public NumeralFieldFormatter(AbstractTextField field) {
		this(field, DEFAULT_DELIMITER, DEFAULT_DECIMAL_MARK, UNDEFINED_INTEGER_SCALE, DEFAULT_DECIMAL_SCALE, false);
	}

	public NumeralFieldFormatter(AbstractTextField field, String delimiter, String decimalMark, int decimalScale) {
		this(field, delimiter, decimalMark, UNDEFINED_INTEGER_SCALE, decimalScale, false);
	}

	/**
	 * Creates a field formatter for numeral fields.
	 *
	 * @param field
	 *            TextField to be extended
	 * @param delimiter
	 *            Delimiter for integer groups
	 * @param decimalMark
	 *            Delimiter for decimal
	 * @param integerScale
	 *            Limit the scale of integer
	 * @param decimalScale
	 *            Number of decimals
	 * @param nonNegativeOnly
	 *            True: allow only non-negative numbers. False: Allow negative,
	 *            0 and positive.
	 */
	public NumeralFieldFormatter(AbstractTextField field, String delimiter, String decimalMark, int integerScale,
			int decimalScale, boolean nonNegativeOnly) {
		super(field);
		getState().formatNumeral = true;
		getState().delimiter = delimiter;
		getState().numeralDecimalMark = decimalMark;
		if (integerScale != -1) {
			getState().numeralIntegerScale = integerScale;
		}
		getState().numeralDecimalScale = decimalScale;
		getState().numeralPositiveOnly = nonNegativeOnly;
	}
}
