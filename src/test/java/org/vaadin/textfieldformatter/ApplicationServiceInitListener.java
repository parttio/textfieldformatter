package org.vaadin.textfieldformatter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.vaadin.flow.router.RouteConfiguration;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.ServiceInitEvent;
import com.vaadin.flow.server.VaadinServiceInitListener;

public class ApplicationServiceInitListener implements VaadinServiceInitListener {

	@Override
	public void serviceInit(ServiceInitEvent event) {
		ArrayList<Class<? extends RouterLayout>> parent = new ArrayList<Class<? extends RouterLayout>>();
		parent.add(MainLayout.class);

		// Reflections reflections = new Reflections("org.vaadin.textfieldformatter");

		// Set<Class<? extends AbstractTest>> allTestUIs =
		// reflections.getSubTypesOf(AbstractTest.class);

		Set<Class<? extends AbstractTest>> allTestUIs = new HashSet<>();

		allTestUIs.add(BasicCreditCardFieldFormatterUsageUI.class);
		allTestUIs.add(BasicIBANFormatterUsageUI.class);
		allTestUIs.add(BasicPhoneFieldFormatterUsageUI.class);
		allTestUIs.add(CSBFDelimitersUI.class);
		allTestUIs.add(CSBFNumericAndPrefixUI.class);
		allTestUIs.add(CSBFNumericAndPrefixWithBlocksUI.class);
		allTestUIs.add(CSBFNumericAndPrefixWithBuilderUI.class);
		allTestUIs.add(CSBFNumericOnlyUI.class);
		allTestUIs.add(CSBFReplacingMaskUI.class);
		allTestUIs.add(CustomNumeralFieldFormatterUsageUI.class);
		allTestUIs.add(DefaultNumeralFieldFormatterUsageUI.class);

		for (Class<? extends AbstractTest> test : allTestUIs) {
			if (!RouteConfiguration.forApplicationScope().isPathRegistered(test.getSimpleName())) {
				RouteConfiguration.forApplicationScope().setRoute(test.getSimpleName(), test, parent);
			}
		}
	}

}
