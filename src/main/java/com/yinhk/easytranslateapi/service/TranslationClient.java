package com.yinhk.easytranslateapi.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.yinhk.easytranslateapi.pojo.TranslationDataDto;

import reactor.core.publisher.Mono;

import com.yinhk.easytranslateapi.pojo.RequestBodyDto;

@Service
public class TranslationClient {
	
	private final WebClient client;
	String baseUrl = "https://deep-translate1.p.rapidapi.com/";
	
	public TranslationClient(WebClient.Builder webClientBuilder) {
		client = webClientBuilder.baseUrl(baseUrl).build();
	}
	
	public TranslationDataDto requestTranslation(String q, String source, String target) {
		
		RequestBodyDto requestBodyDto = new RequestBodyDto();
		
		requestBodyDto.setQ(q);
		requestBodyDto.setSource(source);
		requestBodyDto.setTarget(target);
		
		TranslationDataDto res = client
									.post()
									.uri(uriBuilder -> uriBuilder
										.path("language/translate/v2")
										.build())
									.contentType(MediaType.APPLICATION_JSON)
									.header("content-type", "application/json")
									.header("x-rapidapi-key", "b3f555c827mshd3c19897f1547f4p1f41fejsn241d0bba0d90")
									.header("x-rapidapi-host", "deep-translate1.p.rapidapi.com")
									.body(Mono.just(requestBodyDto), RequestBodyDto.class)
									.retrieve()
									.bodyToMono(TranslationDataDto.class).block();
		return res;
	}
	
}
