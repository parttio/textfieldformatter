package org.vaadin.textfieldformatter;

import org.vaadin.textfieldformatter.CustomStringBlockFormatter.Builder;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.textfield.TextField;

public class CSBFNumericAndPrefixWithBuilderUI extends AbstractTest {

	@Override
	public Component getTestComponent(UITestConfiguration configuration) {
		TextField tf = new TextField();
		Builder builder = new CustomStringBlockFormatter.Builder();
		builder.blocks(1, 2, 3).delimiters("-", "-").numeric().prefix("PREFIX:", " ");
		CustomStringBlockFormatter formatter = builder.build();
		formatter.extend(tf);
		return tf;
	}
}
