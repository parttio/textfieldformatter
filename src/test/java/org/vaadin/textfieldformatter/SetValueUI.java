package org.vaadin.textfieldformatter;

import org.vaadin.textfieldformatter.CustomStringBlockFormatter.ForceCase;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class SetValueUI extends AbstractTest {

	@Override
	public Component getTestComponent(UITestConfiguration configuration) {
		VerticalLayout layout = new VerticalLayout();
		TextField tf = new TextField();
		new CustomStringBlockFormatter(new int[] { 1, 2, 3 }, new String[] { "-", "-" }, ForceCase.NONE, null, false)
				.extend(tf);
		Button btn = new Button("Change value", event -> tf.setValue("ABBCCC"));
		layout.add(tf, btn);
		return layout;
	}
}
