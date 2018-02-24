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
