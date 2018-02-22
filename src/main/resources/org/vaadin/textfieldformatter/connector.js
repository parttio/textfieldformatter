''

window.org_vaadin_textfieldformatter_AbstractTextFieldFormatterExtension = function() {

    var el = this.getElement(this.getParentId());
    var connector = this;
    var cleave = undefined;

    this.onStateChange = function(e) {

        if (this.getState().formatCreditCard) {
            this.cleave = new Cleave(el, {
                creditCard: true,
                onCreditCardTypeChanged: function(type) {
                    connector.onCreditCardChanged(type);
                }
            });
        } else if (this.getState().formatPhone) {
            this.cleave = new Cleave(el, {
                phone: true,
                phoneRegionCode: connector.getState().phoneRegionCode
            });
        }  else if (this.getState().formatNumeral) {
            if (connector.getState().numeralIntegerScale) {
                this.cleave = new Cleave(el, {
                    numeral: true,
                    numeralIntegerScale: connector.getState().numeralIntegerScale,
                    numeralDecimalScale: connector.getState().numeralDecimalScale,
                    numeralDecimalMark: connector.getState().numeralDecimalMark,
                    delimiter: connector.getState().delimiter,
                    numeralPositiveOnly: connector.getState().numeralPositiveOnly,
                });
            } else {
                this.cleave = new Cleave(el, {
                    numeral: true,
                    numeralDecimalScale: connector.getState().numeralDecimalScale,
                    numeralDecimalMark: connector.getState().numeralDecimalMark,
                    delimiter: connector.getState().delimiter,
                    numeralPositiveOnly: connector.getState().numeralPositiveOnly,
                });
            }
        } else if (this.getState().formatBlocks) {
            if (connector.getState().delimiters) {
                this.cleave = new Cleave(el, {
                    blocks: connector.getState().formatBlocks,
                    delimiters: connector.getState().delimiters,
                    uppercase: connector.getState().uppercase,
                    lowercase: connector.getState().lowercase,
                    numericOnly: connector.getState().numericOnly,
                    prefix: connector.getState().prefix
                });
            } else {
                this.cleave = new Cleave(el, {
                    blocks: connector.getState().formatBlocks,
                    uppercase: connector.getState().uppercase,
                    lowercase: connector.getState().lowercase,
                    numericOnly: connector.getState().numericOnly,
                    prefix: connector.getState().prefix
                });
            }
        }
    };

    this.onUnregister = function() {
        this.cleave.destroy();
    };

}