package com.example.demo.controller.util;

public class StringResponse {

	private String message;
	
	@SuppressWarnings("unused")
	private StringResponse() {}

	public StringResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
