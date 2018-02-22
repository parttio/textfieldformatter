package org.vaadin.textfieldformatter;

import org.vaadin.addonhelpers.AbstractTest;
import org.vaadin.textfieldformatter.CustomStringBlockFormatter.ForceCase;
import org.vaadin.textfieldformatter.CustomStringBlockFormatter.Options;

import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.TextField;

public class CSBFReplacingMaskUI extends AbstractTest {

	public static final String INITIAL_VALUE = "Foo!";

	private final Options formatterA = new Options(new int[] { 1, 2, 3 }, new String[] { "-", "-" }, ForceCase.UPPER);
	private final Options formatterB = new Options(new int[] { 2, 2 }, new String[] { "*" }, ForceCase.UPPER);
	private CustomStringBlockFormatter current;
	private TextField textField;

	@Override
	public Component getTestComponent() {
		textField = new TextField();
		current = new CustomStringBlockFormatter(textField, formatterA);
		return textField;
	}

	@Override
	protected void setup() {
		super.setup();
		Button toggleButton = new Button("SWITCH", event -> {
			replaceFormatter(textField, formatterB);
		});
		toggleButton.setId("switch");
		toggleButton.setDisableOnClick(true);
		content.addComponent(toggleButton);
	}

	private void replaceFormatter(TextField textField, Options options) {
		if (current != null) {
			current.remove();
		}
		current = new CustomStringBlockFormatter(textField, options);
	}
}
