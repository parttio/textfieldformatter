package org.vaadin.textfieldformatter;

import org.vaadin.addonhelpers.AbstractTest;
import org.vaadin.textfieldformatter.CustomStringBlockFormatter.Builder;

import com.vaadin.ui.Component;
import com.vaadin.ui.TextField;

public class CSBFNumericAndPrefixWithBuilderUI extends AbstractTest {

	@Override
	public Component getTestComponent() {
		TextField tf = new TextField();
		Builder builder = new CustomStringBlockFormatter.Builder();
		builder.blocks(1, 2, 3).delimiters("-", "-").numeric().prefix("PREFIX:", " ");
		CustomStringBlockFormatter formatter = builder.build();
		formatter.extend(tf);
		return tf;
	}
}
