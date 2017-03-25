package org.vaadin.textfieldformatter;

import com.vaadin.shared.JavaScriptExtensionState;

public class TextFieldFormatterState extends JavaScriptExtensionState {
	public boolean formatCreditCard = false;
	public int[] formatBlocks;
	public String[] delimiters;
	public String delimiter;
	public boolean uppercase = false;
	public boolean lowercase = false;
}
