package com.yinhk.easytranslateapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yinhk.easytranslateapi.pojo.InfoDto;
import com.yinhk.easytranslateapi.pojo.TranslationDataDto;
import com.yinhk.easytranslateapi.service.TranslationClient;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@Validated
@RequestMapping("/")
public class ResponseController {

	@Autowired
	private TranslationClient translationClient;

	@PostMapping("/translate")
	public TranslationDataDto getTranslate(@RequestBody InfoDto infoDto) {
		String q = infoDto.getQuery();
		String source = infoDto.getSource();
		String target = infoDto.getTarget();
		return translationClient.requestTranslation(q, source, target);
	}

}
