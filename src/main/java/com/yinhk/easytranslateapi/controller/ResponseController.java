package com.yinhk.easytranslateapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yinhk.easytranslateapi.pojo.TranslationDataDto;
import com.yinhk.easytranslateapi.service.TranslationClient;


@RestController
@Validated
@RequestMapping("/")
public class ResponseController {
	
	@Autowired
	private TranslationClient translationClient;
	
	@GetMapping("/translate")
	public TranslationDataDto getTranslate(
			@RequestParam(value = "query", required = true) String q,
			@RequestParam(value = "source", required = true) String source,
			@RequestParam(value = "target", required = true) String target) {
		
		return translationClient.requestTranslation(q, source, target);
	}
			
		
}
