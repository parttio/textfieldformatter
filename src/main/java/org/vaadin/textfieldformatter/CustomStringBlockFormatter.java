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
	 * @param numericOnly
	 *            true for allowing numeric characters only. Defaults to false.
	 */
	public CustomStringBlockFormatter(AbstractTextField field, int[] blocks, String[] delimiters, ForceCase forceCase,
			boolean numericOnly) {
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
		getState().numericOnly = numericOnly;
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

	public enum ForceCase {
		NONE, UPPER, LOWER
	}
}
