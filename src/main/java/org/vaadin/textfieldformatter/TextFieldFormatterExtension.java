package org.vaadin.textfieldformatter;

import java.util.EventObject;

import org.vaadin.textfieldformatter.TextFieldFormatterExtension.CreditCardChangedEvent;

import com.vaadin.annotations.JavaScript;
import com.vaadin.data.HasValue.ValueChangeListener;
import com.vaadin.server.AbstractJavaScriptExtension;
import com.vaadin.ui.AbstractTextField;
import com.vaadin.ui.JavaScriptFunction;
import com.vaadin.ui.Notification;

import elemental.json.JsonArray;

/**
 * Extension to TextField allowing you to define formatting of the presentation
 * value of the field
 */
@JavaScript({ "cleave.min.js", "connector.js" })
public class TextFieldFormatterExtension extends AbstractJavaScriptExtension {

	public TextFieldFormatterExtension(AbstractTextField field) {
		extend(field);
		addFunction("onCreditCardChanged", new JavaScriptFunction() {
			@Override
			public void call(JsonArray arguments) {
				Notification.show(arguments.getString(0));
			}
		});
	}
	
	public interface DateFormatter {
	}
	
	public interface CreditCardFormatter {
		
		void addCreditCardChangedListener(CreditCardChangedListener listener);
	}
	
	public interface CreditCardChangedListener {
		void creditCardChanged(CreditCardChangedEvent event);
	}

	public class CreditCardChangedEvent {
		private final CreditCardType creditCardType;
		private final TextFieldFormatterExtension source;
		
		public CreditCardChangedEvent(TextFieldFormatterExtension source, CreditCardType creditCardType) {
			this.source = source;
			this.creditCardType = creditCardType;
		}

		public CreditCardType getCreditCardType() {
			return creditCardType;
		}

		public TextFieldFormatterExtension getSource() {
			return source;
		}
	}
	
	public enum CreditCardType {
		UKNOWN,
		AMEX,
		MASTERCARD,
		VISA,
		DINERS,
		DISCOVER,
		JCB,
		DANKORT,
		INSTAPAYMENT,
		UATP
	}
}