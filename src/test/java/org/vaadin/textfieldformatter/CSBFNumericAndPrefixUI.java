package org.vaadin.textfieldformatter;

import org.vaadin.textfieldformatter.CustomStringBlockFormatter.Options;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.textfield.TextField;

public class CSBFNumericAndPrefixUI extends AbstractTest {

	@Override
	public Component getTestComponent(UITestConfiguration configuration) {
		TextField tf = new TextField();
		Options fmtOptions = new Options();
		fmtOptions.setNumericOnly(true);
		fmtOptions.setPrefix("PREFIX:");
		CustomStringBlockFormatter formatter = new CustomStringBlockFormatter(fmtOptions);
		formatter.extend(tf);
		return tf;
	}
}
