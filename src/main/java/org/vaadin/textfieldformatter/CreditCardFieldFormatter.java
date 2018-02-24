package org.vaadin.textfieldformatter;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.AbstractJavaScriptExtension;
import com.vaadin.ui.AbstractTextField;

import elemental.json.JsonArray;

@JavaScript({ "cleave.min.js", "cc_connector.js" })
public class CreditCardFieldFormatter extends AbstractJavaScriptExtension {

	private final List<CreditCardChangedListener> listeners = new ArrayList<>();

	public CreditCardFieldFormatter() {
		this(false);
	}

	public CreditCardFieldFormatter(boolean support19DigitPAN) {
		getState().creditCardStrictMode = support19DigitPAN;
	}

	@Override
	protected CreditCardFieldFormatterState getState() {
		return (CreditCardFieldFormatterState) super.getState();
	}

	@Override
	protected CreditCardFieldFormatterState getState(boolean markAsDirty) {
		return (CreditCardFieldFormatterState) super.getState(markAsDirty);
	}

	public void extend(AbstractTextField textField) {
		super.extend(textField);
	}

	public void addCreditCardChangedListener(CreditCardChangedListener listener) {
		if (!getState(false).listenCChange) {
			addFunction("onCreditCardChanged", this::onCreditCardChanged);
			getState().listenCChange = true;
		}
		listeners.add(listener);
	}

	private void onCreditCardChanged(JsonArray arguments) {
		final CreditCardType cardType = (arguments != null && arguments.length() > 0
				&& arguments.getString(0).length() > 0) ? CreditCardType.valueOf(arguments.getString(0).toUpperCase())
						: CreditCardType.UNKNOWN;
		listeners
				.forEach(l -> l.creditCardChanged(new CreditCardChangedEvent(CreditCardFieldFormatter.this, cardType)));
	}

	public void removeCreditCardChangedListener(CreditCardChangedListener listener) {
		listeners.remove(listener);
	}

	public interface CreditCardChangedListener {
		void creditCardChanged(CreditCardChangedEvent event);
	}

	public class CreditCardChangedEvent {
		private final CreditCardType creditCardType;
		private final CreditCardFieldFormatter source;

		public CreditCardChangedEvent(CreditCardFieldFormatter source, CreditCardType creditCardType) {
			this.source = source;
			this.creditCardType = creditCardType;
		}

		public CreditCardType getCreditCardType() {
			return creditCardType;
		}

		public CreditCardFieldFormatter getSource() {
			return source;
		}
	}

	public enum CreditCardType {
		UNKNOWN, AMEX, MASTERCARD, VISA, DINERS, DISCOVER, JCB, DANKORT, INSTAPAYMENT, UATP, MIR, UNIONPAY;
	}
}
