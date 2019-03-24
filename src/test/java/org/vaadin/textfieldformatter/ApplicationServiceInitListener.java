package org.vaadin.textfieldformatter;

import java.util.ArrayList;
import java.util.Set;

import org.reflections.Reflections;

import com.vaadin.flow.router.RouteConfiguration;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.ServiceInitEvent;
import com.vaadin.flow.server.VaadinServiceInitListener;

public class ApplicationServiceInitListener implements VaadinServiceInitListener {

	@Override
	public void serviceInit(ServiceInitEvent event) {
		ArrayList<Class<? extends RouterLayout>> parent = new ArrayList<Class<? extends RouterLayout>>();
		parent.add(MainLayout.class);

		Reflections reflections = new Reflections("org.vaadin.textfieldformatter");

		Set<Class<? extends AbstractTest>> allTestUIs = reflections.getSubTypesOf(AbstractTest.class);

		for (Class<? extends AbstractTest> test : allTestUIs) {
			if (!RouteConfiguration.forApplicationScope().isPathRegistered(test.getSimpleName())) {
				RouteConfiguration.forApplicationScope().setRoute(test.getSimpleName(), test, parent);
			}
		}
	}

}
