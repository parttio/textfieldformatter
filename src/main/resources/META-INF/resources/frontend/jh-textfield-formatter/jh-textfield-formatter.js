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

  connectedCallback() {
    super.connectedCallback();
    if (this.conf && !this.cleave) {
      this.cleave = new Cleave(this.parentElement, this.conf);
    }
  }

  disconnectedCallback() {
    super.disconnectedCallback();
    if (this.cleave) {
      this.cleave.destroy();
      this.cleave = undefined;
    }
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

    if (this.cleave) {
      this.cleave.destroy();
      this.cleave = undefined;
    }
    this.cleave = new Cleave(this.parentElement, newConf);
  }
}

window.customElements.define(JhTextfieldFormatter.is, JhTextfieldFormatter);
