package org.vaadin.textfieldformatter;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.function.SerializableConsumer;
import com.vaadin.flow.shared.Registration;

import java.lang.ref.WeakReference;

@Tag("jh-textfield-formatter")
@NpmPackage(value = "cleave.js", version = "1.6.0")
@JsModule("./jh-textfield-formatter/jh-textfield-formatter.js")
@JsModule("./jh-textfield-formatter/import-libphonenumber.js")
public abstract class CleaveExtension extends Component {

	private WeakReference<Component> extended;
	private CleaveConfiguration configuration;
	private Registration attachRegistration = null;

	public CleaveExtension() {
		getConfiguration().copyDelimiter = true;
	}

	protected void extend(Component component) {
		if (!component.getUI().isPresent()) {
			attachRegistration = component.addAttachListener(event -> {
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

	public void getRawValue(SerializableConsumer<String> onValueObtained) {
		getElement().callJsFunction("getRawValue").then(String.class, onValueObtained);
    }

	public void remove() {
		if (attachRegistration != null) {
			attachRegistration.remove();
			attachRegistration = null;
		}
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
