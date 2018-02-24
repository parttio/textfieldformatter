''

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
