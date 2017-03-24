

window.org_vaadin_fieldformatter_FieldFormatterExtension = function() {
    
	var el = this.getElement(this.getParentId());
    
    var connector = this;
    if (this.getState().formatCreditCard) {
        var cleave = new Cleave(el, {
            creditCard: true,
            onCreditCardTypeChanged: function (type) {
            	connector.onCreditCardChanged(type);
            }
        });
    } else if (this.formatBlocks) {
    	
    	if (connector.getState().delimeters) {
        	new Cleave(el, {
        		blocks: connector.getState().blockPattern,
        		delimeters: connector.getState().delimeters,
        		uppercase: connector.getState().uppercase,
        		lowercase: connector.getState().lowercase
        	});    		
    	} else if (connector.getState().delimiter) {
        	new Cleave(el, {
        		blocks: connector.getState().blockPattern,
        		delimeter: connector.getState().delimeter,
        		uppercase: connector.getState().uppercase,
        		lowercase: connector.getState().lowercase
        	});     		
    	}
    	new Cleave(el, {
    		blocks: connector.getState().blockPattern,
    		uppercase: connector.getState().uppercase,
    		lowercase: connector.getState().lowercase    		
    	});
    }
}