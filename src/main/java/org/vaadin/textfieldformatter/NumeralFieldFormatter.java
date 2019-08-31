package org.vaadin.textfieldformatter;

import com.vaadin.ui.AbstractTextField;

public class NumeralFieldFormatter extends CleaveExtension {
	public static String DEFAULT_DELIMITER = ",";
	public static int DEFAULT_DECIMAL_SCALE = 2;
	public static String DEFAULT_DECIMAL_MARK = ".";
	private final static int DEFAULT_INTEGER_SCALE_UNDEFINED = -1;
	private final static boolean DEFAULT_NON_NEGATIVE_ONLY = false;
	private final static ThousandsGroupStyle DEFAULT_THOUSANDS_GROUP_STYLE = ThousandsGroupStyle.THOUSAND;
	private final static boolean DEFAULT_SIGN_BEFORE_PREFIX = false;
	private final static boolean DEFAULT_STRIP_LEADING_ZEROES = true;
	private final static String DEFAULT_NO_PREFIX = null;

	public static enum ThousandsGroupStyle {
		THOUSAND("thousand"), LAKH("lakh"), WAN("wan"), NONE("none");

		private ThousandsGroupStyle(String value) {
			this.value = value;
		}

		private String value;
	}

	/**
	 * Creates a TextFieldFormatter for numeral fields. By default has delimiter ','
	 * and decimal mark '.'. Integer scale is not limited and shows 2 decimals.
	 */
	public NumeralFieldFormatter() {
		this(DEFAULT_DELIMITER, DEFAULT_DECIMAL_MARK, DEFAULT_INTEGER_SCALE_UNDEFINED, DEFAULT_DECIMAL_SCALE, false);
	}

	public NumeralFieldFormatter(String delimiter, String decimalMark, int decimalScale) {
		this(delimiter, decimalMark, DEFAULT_INTEGER_SCALE_UNDEFINED, decimalScale, false);
	}

	/**
	 * Creates a field formatter for numeral fields.
	 *
	 * @param delimiter       Delimiter for integer groups
	 * @param decimalMark     Delimiter for decimal
	 * @param integerScale    Limit the scale of integer i.e. number of digits
	 *                        before decimal
	 * @param decimalScale    Number of decimals
	 * @param nonNegativeOnly True: allow only non-negative numbers. False: Allow
	 *                        negative, 0 and positive.
	 */
	public NumeralFieldFormatter(String delimiter, String decimalMark, int integerScale, int decimalScale,
			boolean nonNegativeOnly) {
		this(delimiter, decimalMark, integerScale, decimalScale, nonNegativeOnly, DEFAULT_THOUSANDS_GROUP_STYLE,
				DEFAULT_SIGN_BEFORE_PREFIX, DEFAULT_STRIP_LEADING_ZEROES, DEFAULT_NO_PREFIX);
	}

	public NumeralFieldFormatter(String delimiter, String decimalMark, int integerScale, int decimalScale,
			boolean nonNegativeOnly, ThousandsGroupStyle thousandsGroupStyle, boolean signBeforePrefix,
			boolean stripLeadingZeroes, String prefix) {
		getState().delimiter = delimiter;
		getState().numeralDecimalMark = decimalMark;
		if (integerScale != DEFAULT_INTEGER_SCALE_UNDEFINED) {
			getState().numeralIntegerScale = integerScale;
		}
		getState().numeralDecimalScale = decimalScale;
		getState().numeralPositiveOnly = nonNegativeOnly;
		getState().numeralThousandsGroupStyle = thousandsGroupStyle.value;
		getState().signBeforePrefix = signBeforePrefix;
		getState().stripLeadingZeroes = stripLeadingZeroes;
		getState().prefix = prefix;
	}

	@Override
	protected NumeralFieldFormatterState getState() {
		return (NumeralFieldFormatterState) super.getState();
	}

	/**
	 * Attaches this extension to a TextField. Extension cannot be moved to another
	 * TextField again.
	 * 
	 * @param textField TextField to attach this extension to
	 */
	public void extend(AbstractTextField textField) {
		super.extend(textField);
	}

	public static class Builder {
		private String delimiter = DEFAULT_DELIMITER;
		private String decimalMark = DEFAULT_DECIMAL_MARK;
		private int integerScale = DEFAULT_INTEGER_SCALE_UNDEFINED;
		private int decimalScale = DEFAULT_DECIMAL_SCALE;
		private boolean nonNegativeOnly = DEFAULT_NON_NEGATIVE_ONLY;
		private ThousandsGroupStyle thousandsGroupStyle = DEFAULT_THOUSANDS_GROUP_STYLE;
		private boolean signBeforePrefix = DEFAULT_SIGN_BEFORE_PREFIX;
		private boolean stripLeadingZeroes = DEFAULT_STRIP_LEADING_ZEROES;
		private String prefix = DEFAULT_NO_PREFIX;

		public Builder delimiter(String value) {
			delimiter = value;
			return this;
		}

		public Builder decimalMark(String value) {
			decimalMark = value;
			return this;
		}

		public Builder integerScale(int value) {
			integerScale = value;
			return this;
		}

		public Builder decimalScale(int value) {
			decimalScale = value;
			return this;
		}

		public Builder nonNegativeOnly(boolean value) {
			nonNegativeOnly = value;
			return this;
		}

		public Builder thousandsGroupStyle(ThousandsGroupStyle value) {
			thousandsGroupStyle = value;
			return this;
		}

		public Builder signBeforePrefix(boolean value) {
			signBeforePrefix = value;
			return this;
		}

		public Builder stripLeadingZeroes(boolean value) {
			stripLeadingZeroes = value;
			return this;
		}

		public Builder prefix(String value) {
			this.prefix = value;
			return this;
		}

		public NumeralFieldFormatter build() {
			return new NumeralFieldFormatter(delimiter, decimalMark, integerScale, decimalScale, nonNegativeOnly,
					thousandsGroupStyle, signBeforePrefix, stripLeadingZeroes, prefix);
		}
	}
}
