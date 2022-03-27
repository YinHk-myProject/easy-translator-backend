package com.yinhk.easytranslateapi.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"translations"
})
public class Data {
	@JsonProperty("translations")
	private Translations translations;

	@JsonProperty("translations")
	public Translations getTranslations() {
		return translations;
	}

	@JsonProperty("translations")
	public void setTranslations(Translations translations) {
		this.translations = translations;
	}
}
