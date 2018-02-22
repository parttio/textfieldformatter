package org.vaadin.textfieldformatter;

import com.vaadin.ui.AbstractTextField;

public class CustomStringBlockFormatter extends AbstractTextFieldFormatterExtension {

	/**
	 * Creates an instance of CustomStringBlockFormatter
	 * 
	 * @param field
	 *            the AbstractTextField to create the extension for
	 * @param blocks
	 *            an array configuring the character blocks. The length of the array
	 *            is the number of character blocks. The integers in the array are
	 *            the length of the blocks.
	 * @param delimiters
	 *            the delimiter characters to be used between the character blocks
	 * @param forceCase
	 *            enumeration to control letter case of characters. One of
	 *            ForceCase.NONE don't touch letter case. ForceCase.LOWER transform
	 *            characters to lower case. ForceCase.UPPER transform characters to
	 *            upper case.
	 * @param prefix
	 *            String prefix for the input
	 * @param numericOnly
	 *            true for allowing numeric characters only. Defaults to false.
	 */
	public CustomStringBlockFormatter(AbstractTextField field, int[] blocks, String[] delimiters, ForceCase forceCase,
			String prefix, boolean numericOnly) {
		super(field);
		getState().formatBlocks = blocks;
		getState().delimiters = delimiters;
		if (forceCase == ForceCase.UPPER) {
			getState().lowercase = false;
			getState().uppercase = true;
		} else if (forceCase == ForceCase.LOWER) {
			getState().lowercase = true;
			getState().uppercase = false;
		}
		getState().prefix = prefix;
		getState().numericOnly = numericOnly;
	}

	public CustomStringBlockFormatter(AbstractTextField field, int[] blocks, String[] delimiters, ForceCase forceCase,
			boolean numericOnly) {
		this(field, blocks, delimiters, forceCase, null, numericOnly);
	}

	/**
	 * Creates an instance of CustomStringBlockFormatter. Call extend to attach this
	 * formatter to a TextField.
	 * 
	 * @param blocks
	 *            an array configuring the character blocks. The length of the array
	 *            is the number of character blocks. The integers in the array are
	 *            the length of the blocks.
	 * @param delimiters
	 *            the delimiter characters to be used between the character blocks
	 * @param forceCase
	 *            enumeration to control letter case of characters. One of
	 *            ForceCase.NONE don't touch letter case. ForceCase.LOWER transform
	 *            characters to lower case. ForceCase.UPPER transform characters to
	 *            upper case.
	 * @param prefix
	 *            String prefix for the input
	 * @param numericOnly
	 *            true for allowing numeric characters only. Defaults to false.
	 */
	public CustomStringBlockFormatter(int[] blocks, String[] delimiters, ForceCase forceCase, String prefix,
			boolean numericOnly) {
		getState().formatBlocks = blocks;
		getState().delimiters = delimiters;
		if (forceCase == ForceCase.UPPER) {
			getState().lowercase = false;
			getState().uppercase = true;
		} else if (forceCase == ForceCase.LOWER) {
			getState().lowercase = true;
			getState().uppercase = false;
		}
		getState().prefix = prefix;
		getState().numericOnly = numericOnly;
	}

	public CustomStringBlockFormatter(int[] blocks, String[] delimiters, ForceCase forceCase, boolean numericOnly) {
		this(blocks, delimiters, forceCase, null, numericOnly);
	}

	public CustomStringBlockFormatter(AbstractTextField field, int[] blocks, String[] delimiters, ForceCase forceCase) {
		this(field, blocks, delimiters, forceCase, false);
	}

	public CustomStringBlockFormatter(AbstractTextField field, int[] blocks, ForceCase forceCase) {
		this(field, blocks, null, forceCase);
	}

	public CustomStringBlockFormatter(AbstractTextField field, int[] blocks) {
		this(field, blocks, null, ForceCase.NONE);
	}

	public CustomStringBlockFormatter(AbstractTextField field, Options options) {
		this(field, options.blocks, options.delimiters, options.forceCase, options.numericOnly);
	}

	public CustomStringBlockFormatter(Options options) {
		this(options.blocks, options.delimiters, options.forceCase, options.numericOnly);
	}

	/**
	 * Adds this extension to a AbstractTextField. Extension cannot be moved to
	 * another TextField. again.
	 */
	public void extend(AbstractTextField textField) {
		super.extend(textField);
	}

	public enum ForceCase {
		NONE, UPPER, LOWER
	}

	public static class Options {
		private int[] blocks;
		private String[] delimiters = null;
		private ForceCase forceCase = ForceCase.NONE;
		private boolean numericOnly = false;
		private String prefix;

		public Options(int[] blocks, String[] delimiters, ForceCase forceCase, String prefix, boolean numericOnly) {
			this.blocks = blocks;
			this.delimiters = delimiters;
			this.forceCase = forceCase;
			this.prefix = prefix;
			this.numericOnly = numericOnly;
		}

		public Options(int[] blocks, String[] delimiters, ForceCase forceCase, boolean numericOnly) {
			this(blocks, delimiters, forceCase, null, numericOnly);
		}

		public Options(int[] blocks, String[] delimiters, ForceCase forceCase) {
			this(blocks, delimiters, forceCase, false);
		}

		public Options(int[] blocks, ForceCase forceCase) {
			this(blocks, null, forceCase);
		}

		public Options(int[] blocks) {
			this(blocks, null, ForceCase.NONE);
		}

		public Options(Options options) {
			this(options.blocks, options.delimiters, options.forceCase, options.prefix, options.numericOnly);
		}

		public Options() {

		}

		public int[] getBlocks() {
			return blocks;
		}

		public void setBlocks(int... blocks) {
			this.blocks = blocks;
		}

		public String[] getDelimiters() {
			return delimiters;
		}

		public void setDelimiters(String... delimiters) {
			this.delimiters = delimiters;
		}

		public ForceCase getForceCase() {
			return forceCase;
		}

		public void setForceCase(ForceCase forceCase) {
			this.forceCase = forceCase;
		}

		public String getPrefix() {
			return prefix;
		}

		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}

		public boolean isNumericOnly() {
			return numericOnly;
		}

		public void setNumericOnly(boolean numericOnly) {
			this.numericOnly = numericOnly;
		}
	}
}
