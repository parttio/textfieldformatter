''

window.org_vaadin_textfieldformatter_AbstractTextFieldFormatterExtension = function() {

	var el = this.getElement(this.getParentId());
	var connector = this;
	if (this.getState().formatCreditCard) {
		var cleave = new Cleave(el, {
			creditCard: true,
			onCreditCardTypeChanged: function(type) {
				connector.onCreditCardChanged(type);
			}
		});
	} else if (this.getState().formatPhone) {
		var cleave = new Cleave(el, {
			phone: true,
			phoneRegionCode: connector.getState().phoneRegionCode
		});
	}  else if (this.getState().formatNumeral) {
		if (connector.getState().numeralIntegerScale) {
			var cleave = new Cleave(el, {
			    numeral: true,
			    numeralIntegerScale: connector.getState().numeralIntegerScale,
			    numeralDecimalScale: connector.getState().numeralDecimalScale,
			    numeralDecimalMark: connector.getState().numeralDecimalMark,
			    delimiter: connector.getState().delimiter,
			    numeralPositiveOnly: connector.getState().numeralPositiveOnly,
			});
		} else {
			var cleave = new Cleave(el, {
			    numeral: true,
			    numeralDecimalScale: connector.getState().numeralDecimalScale,
			    numeralDecimalMark: connector.getState().numeralDecimalMark,
			    delimiter: connector.getState().delimiter,
			    numeralPositiveOnly: connector.getState().numeralPositiveOnly,
			});
		}
	} else if (this.getState().formatBlocks) {
		if (connector.getState().delimiters) {
			new Cleave(el, {
				blocks: connector.getState().formatBlocks,
				delimiters: connector.getState().delimiters,
				uppercase: connector.getState().uppercase,
				lowercase: connector.getState().lowercase
			});
		} else if (connector.getState().delimiter) {
			new Cleave(el, {
				blocks: connector.getState().formatBlocks,
				delimiter: connector.getState().delimiter,
				uppercase: connector.getState().uppercase,
				lowercase: connector.getState().lowercase
			});
		} else {
			new Cleave(el, {
				blocks: connector.getState().formatBlocks,
				uppercase: connector.getState().uppercase,
				lowercase: connector.getState().lowercase
			});
		}
	}
}