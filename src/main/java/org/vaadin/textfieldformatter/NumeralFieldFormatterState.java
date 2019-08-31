package org.vaadin.textfieldformatter;

import com.vaadin.shared.JavaScriptExtensionState;

public class NumeralFieldFormatterState extends JavaScriptExtensionState {
	public int numeralIntegerScale;
	public int numeralDecimalScale;
	public String numeralDecimalMark;
	public boolean numeralPositiveOnly;
	public String delimiter;
	public String numeralThousandsGroupStyle;
	public boolean signBeforePrefix;
	public boolean stripLeadingZeroes;
	public String prefix;
}
