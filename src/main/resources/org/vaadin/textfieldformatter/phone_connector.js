''

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