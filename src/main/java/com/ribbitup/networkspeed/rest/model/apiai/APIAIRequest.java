package com.ribbitup.networkspeed.rest.model.apiai;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class APIAIRequest {
	
	@JsonProperty
	private String lang;
	
	@JsonProperty
	private Status status;
	
	@JsonProperty
	private String timestamp;
	
	@JsonProperty
	private String sessionId;
	
	@JsonProperty
	private Result result;
	
	@JsonProperty
	private String id;
	
	@JsonProperty
	private OriginalRequest originalRequest;
}
