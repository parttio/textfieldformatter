package org.vaadin.textfieldformatter;

import com.vaadin.shared.JavaScriptExtensionState;

public class CreditCardFieldFormatterState extends JavaScriptExtensionState {
	public boolean creditCardStrictMode = false;
	public boolean listenCChange = false;
	public String delimiter;
}
