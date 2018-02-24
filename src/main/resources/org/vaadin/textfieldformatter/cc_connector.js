''

window.org_vaadin_textfieldformatter_CreditCardFieldFormatter = function() {

    var el = this.getElement(this.getParentId());
    var connector = this;
    var cleave = undefined;

    this.onStateChange = function(e) {
    	if (this.cleave) {
    		this.cleave.destroy();
    	}
        if (this.getState().listenCChange) {
            this.cleave = new Cleave(el, {
                creditCard: true,
                credtiCardStrictMode: connector.getState().creditCardStrictMode,
                onCreditCardTypeChanged: function(type) {
                    connector.onCreditCardChanged(type);
                }
            });
        } else {
            this.cleave = new Cleave(el, {
                creditCard: true,
                credtiCardStrictMode: connector.getState().creditCardStrictMode
            });
        }
    };

    this.onUnregister = function() {
        this.cleave.destroy();
    };

}