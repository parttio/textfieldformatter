package org.vaadin.textfieldformatter;

import org.vaadin.textfieldformatter.CustomStringBlockFormatter.ForceCase;
import org.vaadin.textfieldformatter.CustomStringBlockFormatter.Options;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.textfield.TextField;

public class CSBFNumericAndPrefixWithBlocksUI extends AbstractTest {

	@Override
	public Component getTestComponent(UITestConfiguration configuration) {
		TextField tf = new TextField();
		Options fmtOptions = new Options();
		fmtOptions.setBlocks(7, 1, 2, 3);
		fmtOptions.setDelimiters(" ", "-", "-");
		fmtOptions.setForceCase(ForceCase.NONE);
		fmtOptions.setNumericOnly(true);
		fmtOptions.setPrefix("PREFIX:");
		CustomStringBlockFormatter formatter = new CustomStringBlockFormatter(fmtOptions);
		formatter.extend(tf);
		return tf;
	}
}
