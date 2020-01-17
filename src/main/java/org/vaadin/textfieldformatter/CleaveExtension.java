package org.vaadin.textfieldformatter;

import java.lang.ref.WeakReference;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("jh-textfield-formatter")
@NpmPackage(value = "cleave.js", version = "1.5.3")
@JsModule("cleave.js/dist/cleave-esm.js")
@JsModule("./jh-textfield-formatter/jh-textfield-formatter.js")
public abstract class CleaveExtension extends Component {

	private WeakReference<Component> extended;
	private CleaveConfiguration configuration;

	protected void extend(Component component) {
		if (!component.getUI().isPresent()) {
			component.addAttachListener(event -> {
				extend(component, event.getUI());
			});

		} else {
			extend(component, component.getUI().get());
		}
	}

	private void extend(Component component, UI ui) {
		extended = new WeakReference<Component>(component);
		component.getElement().appendChild(getElement());
		getElement().setPropertyJson("conf", getConfiguration().toJson());
	}

	public void remove() {
		if (extended != null) {
			getElement().removeFromParent();
			extended.clear();
		}
	}

	protected CleaveConfiguration getConfiguration() {
		if (configuration == null) {
			configuration = new CleaveConfiguration();
		}
		return configuration;
	}
}
