package com.ribbitup.networkspeed.rest.model.apiai;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Message {

	@JsonProperty
	private String speech;
	
	@JsonProperty
	private int type;
}
