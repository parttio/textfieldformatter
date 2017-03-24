package org.vaadin.textfieldformatter;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.ui.AbstractTextField;
import com.vaadin.ui.JavaScriptFunction;

import elemental.json.JsonArray;

public class CreditCardFieldFormatter extends AbstractTextFieldFormatterExtension {

	private final List<CreditCardChangedListener> listeners = new ArrayList<>();

	public CreditCardFieldFormatter(AbstractTextField field) {
		super(field);
		getState().formatCreditCard = true;
	}

	public void addCreditCardChangedListener(CreditCardChangedListener listener) {
		if (listeners.isEmpty()) {
			addFunction("onCreditCardChanged", new JavaScriptFunction() {
				@Override
				public void call(JsonArray arguments) {
					final CreditCardType cardType = (arguments != null && arguments.length() > 0
							&& arguments.getString(0).length() > 0) ? CreditCardType.valueOf(arguments.getString(0).toUpperCase())
									: CreditCardType.UNKNOWN;
					listeners.forEach(l -> l
							.creditCardChanged(new CreditCardChangedEvent(CreditCardFieldFormatter.this, cardType)));
				}
			});
		}
		listeners.add(listener);
	}

	public void removeCreditCardChangedListener(CreditCardChangedListener listener) {
		listeners.remove(listener);
	}

	public interface CreditCardChangedListener {
		void creditCardChanged(CreditCardChangedEvent event);
	}

	public class CreditCardChangedEvent {
		private final CreditCardType creditCardType;
		private final AbstractTextFieldFormatterExtension source;

		public CreditCardChangedEvent(AbstractTextFieldFormatterExtension source, CreditCardType creditCardType) {
			this.source = source;
			this.creditCardType = creditCardType;
		}

		public CreditCardType getCreditCardType() {
			return creditCardType;
		}

		public AbstractTextFieldFormatterExtension getSource() {
			return source;
		}
	}

	public enum CreditCardType {
		UNKNOWN, AMEX, MASTERCARD, VISA, DINERS, DISCOVER, JCB, DANKORT, INSTAPAYMENT, UATP
	}
}
