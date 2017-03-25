package org.vaadin.textfieldformatter;

import java.util.Arrays;

import com.vaadin.ui.AbstractTextField;

public class IBANFormatter extends CustomStringBlockFormatter {

	public IBANFormatter(AbstractTextField field, int[] blocks) {
		super(field, blocks, ForceCase.UPPER);
	}
	
	public static IBANFormatter fromIBANLength(AbstractTextField field, int length) {
		int num4s = length / 4;
		int lastBlock = length % 4;
		int[] blocks = null;
		if (lastBlock != 0) {
			blocks = new int[num4s + 1];
			Arrays.fill(blocks, 4);
			blocks[blocks.length - 1] = lastBlock;
		} else {
			blocks = new int[num4s];
			Arrays.fill(blocks, 4);
		}
		return new IBANFormatter(field, blocks) ;
	}

}
