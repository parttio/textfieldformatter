package org.vaadin.textfieldformatter;

import java.util.function.Consumer;

import elemental.json.Json;
import elemental.json.JsonArray;
import elemental.json.JsonObject;

public class CleaveConfiguration {
	public Boolean creditCard;
	public Boolean creditCardStrictMode;
	public String delimiter;

	public int[] blocks;
	public String[] delimiters;
	public Boolean uppercase;
	public Boolean lowercase;
	public Boolean numericOnly;
	public String prefix;
	public Boolean showPrefixImmediately;

	public Boolean numeral;
	public Integer numeralIntegerScale;
	public Integer numeralDecimalScale;
	public String numeralDecimalMark;
	public Boolean numeralPositiveOnly;
	public String numeralThousandsGroupStyle;
	public Boolean signBeforePrefix;
	public Boolean stripLeadingZeroes;

	public Boolean phone;
	public String phoneRegionCode;

	protected JsonObject toJson() {
		JsonObject json = Json.createObject();

		ifNotNull(creditCard, value -> json.put("creditCard", value));
		ifNotNull(creditCardStrictMode, value -> json.put("creditCardStrictMode", value));
		ifNotNull(delimiter, value -> json.put("delimiter", value));
		ifNotNullArray(blocks, value -> json.put("blocks", value));
		ifNotNullArray(delimiters, value -> json.put("delimiters", value));
		ifNotNull(uppercase, value -> json.put("uppercase", value));
		ifNotNull(lowercase, value -> json.put("lowercase", value));
		ifNotNull(numericOnly, value -> json.put("numericOnly", value));
		ifNotNull(prefix, value -> json.put("prefix", value));
		ifNotNull(showPrefixImmediately, value -> json.put("noImmediatePrefix", !value));
		ifNotNull(numeral, value -> json.put("numeral", value));
		ifNotNull(numeralIntegerScale, value -> json.put("numeralIntegerScale", value));
		ifNotNull(numeralDecimalScale, value -> json.put("numeralDecimalScale", value));
		ifNotNull(numeralDecimalMark, value -> json.put("numeralDecimalMark", value));
		ifNotNull(numeralPositiveOnly, value -> json.put("numeralPositiveOnly", value));
		ifNotNull(numeralThousandsGroupStyle, value -> json.put("numeralThousandsGroupStyle", value));
		ifNotNull(signBeforePrefix, value -> json.put("signBeforePrefix", value));
		ifNotNull(stripLeadingZeroes, value -> json.put("stripLeadingZeroes", value));
		ifNotNull(phone, value -> json.put("phone", value));
		ifNotNull(phoneRegionCode, value -> json.put("phoneRegionCode", value));

		return json;
	}

	private <T> void ifNotNull(T value, Consumer<T> put) {
		if (value != null) {
			put.accept(value);
		}
	}

	private void ifNotNullArray(int[] value, Consumer<JsonArray> put) {
		if (value != null) {
			JsonArray array = Json.createArray();
			for (int i = 0; i < value.length; i++) {
				array.set(i, value[i]);
			}
			put.accept(array);
		}
	}

	private void ifNotNullArray(String[] value, Consumer<JsonArray> put) {
		if (value != null) {
			JsonArray array = Json.createArray();
			for (int i = 0; i < value.length; i++) {
				array.set(i, value[i]);
			}
			put.accept(array);
		}
	}
}
