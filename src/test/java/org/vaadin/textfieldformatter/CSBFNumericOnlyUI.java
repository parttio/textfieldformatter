package org.vaadin.textfieldformatter;

import org.vaadin.addonhelpers.AbstractTest;
import org.vaadin.textfieldformatter.CustomStringBlockFormatter.ForceCase;

import com.vaadin.ui.Component;
import com.vaadin.ui.TextField;

public class CSBFNumericOnlyUI extends AbstractTest {

	public static final String INITIAL_VALUE = "Foo!";

	@Override
	public Component getTestComponent() {
		TextField tf = new TextField();
		new CustomStringBlockFormatter(tf, new int[] { 1, 2, 3 }, new String[] { "-", "-" }, ForceCase.NONE, true);
		return tf;
	}
}
