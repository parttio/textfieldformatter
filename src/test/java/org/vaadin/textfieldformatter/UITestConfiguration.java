package org.vaadin.textfieldformatter;

import com.vaadin.flow.component.Component;

public abstract class UITestConfiguration {

	public abstract Component getTestComponent();

	public static String getName(Class<?> clazz) {

		StringBuilder sb = new StringBuilder();
		for (char c : clazz.getSimpleName().toCharArray()) {
			if (Character.isUpperCase(c) && sb.length() > 0) {
				sb.append('-');
			}
			sb.append(c);
		}
		return sb.toString();
	}
}
