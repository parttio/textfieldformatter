package org.vaadin.textfieldformatter;

import com.vaadin.shared.JavaScriptExtensionState;

public class TextFieldFormatterState extends JavaScriptExtensionState {
	public boolean formatCreditCard = false;
	public int[] formatBlocks;
	public String[] delimiters;
	public String delimiter;
	public boolean uppercase = false;
	public boolean lowercase = false;
	public boolean formatPhone = false;
	public String phoneRegionCode;
	public boolean formatNumeral = false;
	public int numeralIntegerScale;
	public int numeralDecimalScale;
	public String numeralDecimalMark;
	public boolean numeralPositiveOnly;
}
