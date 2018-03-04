''

window.org_vaadin_textfieldformatter_CustomStringBlockFormatter = function() {

    var el = this.getElement(this.getParentId());
    var connector = this;
    var cleave = undefined;

    this.onStateChange = function(e) {

        if (connector.getState().delimiters) {
            this.cleave = new Cleave(el, {
                blocks : connector.getState().formatBlocks,
                delimiters : connector.getState().delimiters,
                uppercase : connector.getState().uppercase,
                lowercase : connector.getState().lowercase,
                numericOnly : connector.getState().numericOnly,
                prefix : connector.getState().prefix
            });
        } else {
            this.cleave = new Cleave(el, {
                blocks : connector.getState().formatBlocks,
                uppercase : connector.getState().uppercase,
                lowercase : connector.getState().lowercase,
                numericOnly : connector.getState().numericOnly,
                prefix : connector.getState().prefix
            });
        }
    };

    this.onUnregister = function() {
        this.cleave.destroy();
    };
}

window.org_vaadin_textfieldformatter_PhoneFieldFormatter = function() {

    var el = this.getElement(this.getParentId());
    var connector = this;
    var cleave = undefined;

    this.onStateChange = function(e) {

        this.cleave = new Cleave(el, {
            phone: true,
            phoneRegionCode: connector.getState().phoneRegionCode
        });
    };

    this.onUnregister = function() {
        this.cleave.destroy();
    };

}


window.org_vaadin_textfieldformatter_NumeralFieldFormatter = function() {

    var el = this.getElement(this.getParentId());
    var connector = this;
    var cleave = undefined;

    this.onStateChange = function(e) {

        if (connector.getState().numeralIntegerScale) {
            this.cleave = new Cleave(el, {
                numeral : true,
                numeralIntegerScale : connector.getState().numeralIntegerScale,
                numeralDecimalScale : connector.getState().numeralDecimalScale,
                numeralDecimalMark : connector.getState().numeralDecimalMark,
                delimiter : connector.getState().delimiter,
                numeralPositiveOnly : connector.getState().numeralPositiveOnly,
            });
        } else {
            this.cleave = new Cleave(el, {
                numeral : true,
                numeralDecimalScale : connector.getState().numeralDecimalScale,
                numeralDecimalMark : connector.getState().numeralDecimalMark,
                delimiter : connector.getState().delimiter,
                numeralPositiveOnly : connector.getState().numeralPositiveOnly,
            });
        }
    };

    this.onUnregister = function() {
        this.cleave.destroy();
    };

}

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
