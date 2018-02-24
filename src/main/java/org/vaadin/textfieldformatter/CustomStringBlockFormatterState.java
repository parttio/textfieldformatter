package org.vaadin.textfieldformatter;

import com.vaadin.shared.JavaScriptExtensionState;

public class CustomStringBlockFormatterState extends JavaScriptExtensionState {
	public int[] formatBlocks;
	public String[] delimiters;
	public String delimiter;
	public boolean uppercase = false;
	public boolean lowercase = false;
	public boolean numericOnly = false; // for CustomStringBlockFormatter
	public String prefix; // for CustomStringBlockFormatter
}
