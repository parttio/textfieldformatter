import { PolymerElement } from '@polymer/polymer/polymer-element.js';
import Cleave from './cleave-esm.min.js';
/**
 * `jh-textfield-formatter`
 * Polymer 2 Web Component wrapper for Cleave.js
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
      _cleave: {
        type: Object
      }
    };
  }

  connectedCallback() {
    super.connectedCallback();
    if (this.cleave) {
      this.cleave.destroy();
      this.cleave = undefined;
    }

    if (this.conf) {
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
    if (!this.cleave) {
      this.cleave = new Cleave(this.parentElement, newConf);
    } else {
      this.cleave.destroy();
      this.cleave = new Cleave(this.parentElement, newConf)
    }
/*
    if (this.getState().listenCChange) {
        this.cleave = new Cleave(el, {
            creditCard: true,
            credtiCardStrictMode: connector.getState().creditCardStrictMode,
            onCreditCardTypeChanged: function(type) {
                connector.onCreditCardChanged(type);
            }
        });
    } else {
*/
        /*creditCardStrictMode: connector.getState().creditCardStrictMode*/
/*        }*/
  }
}

window.customElements.define(JhTextfieldFormatter.is, JhTextfieldFormatter);
