package org.vaadin.textfieldformatter;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteConfiguration;
import com.vaadin.flow.router.RouteData;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@Route
@Theme(Lumo.class)
public class MainView extends HorizontalLayout implements RouterLayout {

	private VerticalLayout menu;
	private HasElement content;

	public MainView() {
		menu = new VerticalLayout();
		menu.setSpacing(true);
		menu.setMargin(true);
		setSizeFull();
		add(menu);

		for (RouteData route : RouteConfiguration.forApplicationScope().getAvailableRoutes()) {
			addRouterLink(route.getUrl(), route.getNavigationTarget());
		}
	}

	@Override
	public void showRouterLayoutContent(HasElement newContent) {
		if (content != null) {
			content.getElement().removeFromParent();
		}

		getElement().appendChild(newContent.getElement());
		content = newContent;
		setFlexGrow(1, content);
	}

	private void addRouterLink(String text, Class<? extends Component> target) {
		RouterLink link = new RouterLink(text, target);
		menu.add(link);
	}
}