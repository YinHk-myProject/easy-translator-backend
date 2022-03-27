package com.yinhk.easytranslateapi.pojo;

public class RequestBodyDto {
	
	private String q;
	private String source;
	private String target;
	
	/*
	public RequestBodyDto(String q, String source, String target) {
		setQ(q);
		setSource(source);
		setTarget(target);
	}*/
	
	public String getQ() {
		return q;
	}
	
	public void setQ(String query) {
		this.q = query;
	}
	
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	public String getTarget() {
		return target;
	}
	
	public void setTarget(String target) {
		this.target = target;
	}
	
}
