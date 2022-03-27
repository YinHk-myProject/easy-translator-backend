package com.yinhk.easytranslateapi.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"translatedText"
})
public class Translations {
	
	@JsonProperty("translatedText")
	private String translatedText;

	@JsonProperty("translatedText")
	public String getTranslatedText() {
		return translatedText;
	}

	@JsonProperty("translatedText")
	public void setTranslatedText(String translatedText) {
		this.translatedText = translatedText;
	}
	
}
