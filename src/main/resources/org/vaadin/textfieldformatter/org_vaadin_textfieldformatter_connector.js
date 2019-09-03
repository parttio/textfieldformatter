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

        if (this.cleave) {
            this.cleave.destroy();
        }

        var options = {
            numeral : true,
            numeralDecimalScale : connector.getState().numeralDecimalScale,
            numeralDecimalMark : connector.getState().numeralDecimalMark,
            delimiter : connector.getState().delimiter,
            numeralPositiveOnly : connector.getState().numeralPositiveOnly,
            numeralThousandsGroupStyle : connector.getState().numeralThousandsGroupStyle,
            signBeforePrefix : connector.getState().signBeforePrefix,
            stripLeadingZeroes : connector.getState().stripLeadingZeroes,
            prefix : connector.getState().prefix
        };

        if (connector.getState().numeralIntegerScale) {
            options.numeralIntegerScale = connector.getState().numeralIntegerScale;
        }
        this.cleave = new Cleave(el, options);
    };

    this.onUnregister = function() {
        this.cleave.destroy();
    };

}

window.org_vaadin_textfieldformatter_DateFieldFormatter = function() {

    var el = this.getElement(this.getParentId());
    var connector = this;
    var cleave = undefined;

    this.onStateChange = function(e) {
        if (this.cleave) {
            this.cleave.destroy();
        }

        var options = {
            date: true,
            datePattern: connector.getState().datePattern
        };

        if (connector.getState().dateMin) {
            options.dateMin = connector.getState().dateMin;
        }

        if (connector.getState().dateMax) {
            options.dateMax = connector.getState().dateMax;
        }

        if (connector.getState().delimiter) {
            options.delimiter = connector.getState().delimiter;
        }

        this.cleave = new Cleave(el, options);
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

window.org_vaadin_textfieldformatter_AttributeExtension = function() {

    var el = this.getElement(this.getParentId());
    var connector = this;

    this.onStateChange = function(e) {

       let attributes = this.getState().attributes;
       if (attributes.length === 2) {
           for (i = 0; i < attributes[0].length; i++) {
               el.setAttribute(attributes[0][i], attributes[1][i]);
           }
       }
    };

    this.onUnregister = function() {
       let attributes = this.getState().attributes;
       for (let [key, value] of attributes.entries()) {
               console.log(key + ' = '  + value);
       }
    };

}
