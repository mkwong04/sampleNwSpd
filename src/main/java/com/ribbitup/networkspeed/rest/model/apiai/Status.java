package com.ribbitup.networkspeed.rest.model.apiai;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Status {

	@JsonProperty
	private String errorType;
	
	@JsonProperty
	private int code;
}
