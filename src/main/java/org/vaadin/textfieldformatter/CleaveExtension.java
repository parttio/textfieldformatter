package org.vaadin.textfieldformatter;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.AbstractJavaScriptExtension;

@JavaScript({ "cleave.min.js", "org_vaadin_textfieldformatter_connector.js" })
public abstract class CleaveExtension extends AbstractJavaScriptExtension {

}
