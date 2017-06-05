package com.ribbitup.networkspeed.rest.model.apiai;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OriginalRequest {

	@JsonProperty
	private String source;
	
	@JsonProperty
	private RequestData data; 
}
