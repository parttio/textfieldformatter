package org.vaadin.textfieldformatter;

import com.vaadin.flow.component.textfield.TextField;

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
	private final static boolean DEFAULT_TAIL_PREFIX = false;

	public static enum ThousandsGroupStyle {
		/**
		 * Groups numbers in thousands and the delimiter occurs every 3 digits.
		 * 1,234,567.89
		 */
		THOUSAND("thousand"),
		/**
		 * Indian numbering group style. It groups the rightmost 3 digits in a similar
		 * manner to regular way but then groups every 2 digits thereafter. 12,34,567.89
		 */
		LAKH("lakh"),
		/**
		 * Chinese numbering group style. It groups numbers in 10-thousand(万, 萬) and the
		 * delimiter occurs every 4 digits. 123,4567.89
		 */
		WAN("wan"),
		/**
		 * Does not group thousands. 1234567.89
		 */
		NONE("none");

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
				DEFAULT_SIGN_BEFORE_PREFIX, DEFAULT_STRIP_LEADING_ZEROES, DEFAULT_NO_PREFIX, DEFAULT_TAIL_PREFIX);
	}

	/**
	 * Creates a field formatter for numeral fields.
	 *
	 * @param delimiter           Delimiter for integer groups. Default `,`
	 * @param decimalMark         Delimiter for decimal. Default `.`
	 * @param integerScale        Limit the scale of integer i.e. number of digits
	 *                            before decimal. Default no limit.
	 * @param decimalScale        Number of decimals. Default 2.
	 * @param nonNegativeOnly     True: allow only non-negative numbers. False:
	 *                            Allow negative, 0 and positive. Default false.
	 * @param thousandsGroupStyle Thousands separator grouping style see
	 *                            {@link ThousandsGroupStyle}. Default
	 *                            ThousandsGroupStyle.THOUSAND
	 * @param signBeforePrefix    True if the sign of the numeral should appear
	 *                            before the prefix. Default false.
	 * @param stripLeadingZeroes  True if zeroes appearing at the beginning of the
	 *                            number should be stripped out. Default true.
	 * @param prefix              Prefix e.g. $. Default no prefix.
	 */
	public NumeralFieldFormatter(String delimiter, String decimalMark, int integerScale, int decimalScale,
			boolean nonNegativeOnly, ThousandsGroupStyle thousandsGroupStyle, boolean signBeforePrefix,
			boolean stripLeadingZeroes, String prefix) {
		this(delimiter, decimalMark, integerScale, decimalScale, nonNegativeOnly, thousandsGroupStyle, signBeforePrefix,
				stripLeadingZeroes, prefix, DEFAULT_TAIL_PREFIX);
	}

	/**
	 * Creates a field formatter for numeral fields.
	 *
	 * @param delimiter           Delimiter for integer groups. Default `,`
	 * @param decimalMark         Delimiter for decimal. Default `.`
	 * @param integerScale        Limit the scale of integer i.e. number of digits
	 *                            before decimal. Default no limit.
	 * @param decimalScale        Number of decimals. Default 2.
	 * @param nonNegativeOnly     True: allow only non-negative numbers. False:
	 *                            Allow negative, 0 and positive. Default false.
	 * @param thousandsGroupStyle Thousands separator grouping style see
	 *                            {@link ThousandsGroupStyle}. Default
	 *                            ThousandsGroupStyle.THOUSAND
	 * @param signBeforePrefix    True if the sign of the numeral should appear
	 *                            before the prefix. Default false.
	 * @param stripLeadingZeroes  True if zeroes appearing at the beginning of the
	 *                            number should be stripped out. Default true.
	 * @param prefix              Prefix e.g. $. Default no prefix.
	 * @param addPrefixAsPostfix  Shows the prefix as postfix/suffix (after the
	 *                            numeral).
	 */
	public NumeralFieldFormatter(String delimiter, String decimalMark, int integerScale, int decimalScale,
			boolean nonNegativeOnly, ThousandsGroupStyle thousandsGroupStyle, boolean signBeforePrefix,
			boolean stripLeadingZeroes, String prefix, boolean addPrefixAsPostfix) {
		getConfiguration().numeral = true;
		getConfiguration().delimiter = delimiter;
		getConfiguration().numeralDecimalMark = decimalMark;
		if (integerScale != DEFAULT_INTEGER_SCALE_UNDEFINED) {
			getConfiguration().numeralIntegerScale = integerScale;
		}
		getConfiguration().numeralDecimalScale = decimalScale;
		getConfiguration().numeralPositiveOnly = nonNegativeOnly;
		getConfiguration().numeralThousandsGroupStyle = thousandsGroupStyle.value;
		getConfiguration().signBeforePrefix = signBeforePrefix;
		getConfiguration().stripLeadingZeroes = stripLeadingZeroes;
		getConfiguration().prefix = prefix;
		getConfiguration().tailPrefix = addPrefixAsPostfix;
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
		private boolean tailPrefix = DEFAULT_TAIL_PREFIX;

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
			return prefix(value, false);
		}

		/**
		 * Sets the prefix with possibility to add it to tail as postix/suffix with
		 * addAsPostfix true.
		 * 
		 * @param value        the prefix
		 * @param addAsPostfix true if the prefix should be shown as postfix/suffix
		 *                     (after the numeral).
		 */
		public Builder prefix(String value, boolean addAsPostfix) {
			this.prefix = value;
			this.tailPrefix = addAsPostfix;
			return this;
		}

		public NumeralFieldFormatter build() {
			return new NumeralFieldFormatter(delimiter, decimalMark, integerScale, decimalScale, nonNegativeOnly,
					thousandsGroupStyle, signBeforePrefix, stripLeadingZeroes, prefix, tailPrefix);
		}
	}

}
