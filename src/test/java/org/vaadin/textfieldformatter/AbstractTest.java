package org.vaadin.textfieldformatter;

import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;

import com.vaadin.annotations.Theme;
import com.vaadin.server.Sizeable;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Component;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("valo")
public abstract class AbstractTest extends UI {

	private final static Logger logger = Logger.getLogger(AbstractTest.class.getName());

	protected VerticalLayout content;

	public AbstractTest() {
		content = new VerticalLayout();
		setContent(content);
	}

	/**
	 * Sets the size of the content. Override to change from
	 * {@link Sizeable#setSizeFull()}
	 * 
	 * @param content the content component
	 */
	public void setContentSize(Component content) {
		content.setSizeFull();
	}

	public abstract Component getTestComponent(UITestConfiguration configuration);

	@Override
	protected void init(VaadinRequest request) {
		getPage().addPopStateListener(e -> enter());

		enter();
		if (StringUtils.isNotBlank(getDescription())) {
			Notification.show(getDescription(), Notification.Type.WARNING_MESSAGE);
		}
	}

	protected void enter() {
		UITestConfiguration testConfiguration = null;
		URI location = getPage().getLocation();
		String[] split = location.getPath().split("/");
		if (split.length > 0) {
			String configuration = split[split.length - 1];
			final String className = getClass().getCanonicalName() + "$" + configuration;
			try {

				Class<?> configurationClass = Class.forName(className);
				if (!UITestConfiguration.class.isAssignableFrom(configurationClass)) {
					logger.log(Level.SEVERE,
							"Test configuration not a sub class of " + UITestConfiguration.class.getSimpleName());
				}
				try {
					testConfiguration = (UITestConfiguration) configurationClass.newInstance();
				} catch (InstantiationException | IllegalAccessException e) {
					logger.log(Level.SEVERE,
							"Can't instantiate UITestConfiguration : " + configurationClass.getCanonicalName());
				}

			} catch (ClassNotFoundException e) {
				logger.log(Level.SEVERE, "Class not found: " + className);
			}
		}
		Component testComponent = getTestComponent(testConfiguration);
		setContentSize(content);
		content.addComponent(testComponent);
		content.setExpandRatio(testComponent, 1);
	}

}
