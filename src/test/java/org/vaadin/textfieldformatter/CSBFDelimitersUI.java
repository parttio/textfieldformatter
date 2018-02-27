package org.vaadin.textfieldformatter;

import org.vaadin.addonhelpers.AbstractTest;
import org.vaadin.textfieldformatter.CustomStringBlockFormatter.ForceCase;

import com.vaadin.ui.Component;
import com.vaadin.ui.TextField;

public class CSBFDelimitersUI extends AbstractTest {

	@Override
	public Component getTestComponent() {
		TextField tf = new TextField();
		new CustomStringBlockFormatter(new int[] { 1, 2, 3 }, new String[] { "-", "-" }, ForceCase.NONE, null, false).extend(tf);
		return tf;
	}
}
