package org.vaadin.textfieldformatter;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(layout = MainView.class)
public abstract class AbstractTest extends VerticalLayout {

	public AbstractTest() {
	}

	@Override
	protected void onAttach(AttachEvent attachEvent) {
		super.onAttach(attachEvent);
		setup();
	}

	protected void setup() {
		Component map = getTestComponent();
		setContentSize(this);
		add(map);
		setFlexGrow(1, map);
	}

	/**
	 * Sets the size of the content. Override to change from
	 * {@link HasSize#setSizeFull()}
	 * 
	 * @param content
	 *            the content component
	 */
	public void setContentSize(HasSize content) {
		content.setSizeFull();
	}

	public abstract Component getTestComponent();
}
