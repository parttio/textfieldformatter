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
	} else if (this.getState().formatBlocks) {

		if (connector.getState().delimeters) {
			new Cleave(el, {
				blocks: connector.getState().formatBlocks,
				delimeters: connector.getState().delimeters,
				uppercase: connector.getState().uppercase,
				lowercase: connector.getState().lowercase
			});
		} else if (connector.getState().delimiter) {
			new Cleave(el, {
				blocks: connector.getState().formatBlocks,
				delimeter: connector.getState().delimeter,
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