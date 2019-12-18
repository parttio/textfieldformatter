import { PolymerElement } from '@polymer/polymer/polymer-element.js';
import Cleave from 'cleave.js';
/**
 * `jh-textfield-formatter` Polymer 2 Web Component wrapper for Cleave.js
 *
 * @customElement
 * @polymer
 * @demo demo/index.html
 */
class JhTextfieldFormatter extends PolymerElement {
  static get is() { return 'jh-textfield-formatter'; }
  static get properties() {
    return {
      conf: {
        type: Object,
        observer: '_confChanged'
      },
      cleave: {
        type: Object
      },

    };
  }

  constructor() {
      super();
      this._inputListener = this._onInputChange.bind(this);
  }

  connectedCallback() {
    super.connectedCallback();
    if (this.conf) {
      this.cleave = new Cleave(this.parentElement, this.conf);
    }
    this.removeValueChangedFromParentElement = this._removeEventFromElement.bind(this.parentElement, 'value-changed', this._inputListener);
    this.parentElement.addEventListener('value-changed', this._inputListener);
  }

  disconnectedCallback() {
    this.removeValueChangedFromParentElement();
    super.disconnectedCallback();
    this._clean();

  }

  _confChanged(newConf, oldConf) {
    if (!newConf) {
      return;
    }

    this.conf = newConf;
    if (newConf.creditCard) {
      newConf.onCreditCardTypeChanged = type => {
        this.$server.onCreditCardChanged(type);
      }
    }

    this._clean();
    this.cleave = new Cleave(this.parentElement, newConf);
  }

  _onInputChange(event) {
    this.cleave.onChange(event.target.value);
  }

  _removeEventFromElement(event, listener) {
      this.removeEventListener(event, listener);
  }

  _clean() {
    if (this.cleave) {
      this.cleave.destroy();
      this.cleave = undefined;
    }
  }
}

window.customElements.define(JhTextfieldFormatter.is, JhTextfieldFormatter);
