package org.vaadin.textfieldformatter;

import com.vaadin.ui.AbstractTextField;

public class CustomStringBlockFormatter extends AbstractTextFieldFormatterExtension {

	public CustomStringBlockFormatter(AbstractTextField field, int[] blocks, String[] delimeters, ForceCase forceCase) {
		super(field);
		getState().formatBlocks = blocks;
		getState().delimeters = delimeters;
		if (forceCase == ForceCase.UPPER) {
			getState().lowercase = false;
			getState().uppercase = true;			
		} else if (forceCase == ForceCase.LOWER) {
			getState().lowercase = true;
			getState().uppercase = false;
		}
	}
	
	public CustomStringBlockFormatter(AbstractTextField field, int[] blocks, ForceCase forceCase) {
		this(field, blocks, null, forceCase);
	}
	
	public CustomStringBlockFormatter(AbstractTextField field, int[] blocks) {
		this(field, blocks, null, ForceCase.NONE);
	}
	
	public enum ForceCase {
		NONE,
		UPPER,
		LOWER
	}
}
