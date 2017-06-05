package com.ribbitup.networkspeed.rest.model.apiai;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Argument {

	@JsonProperty
	private String text_value;
	
	@JsonProperty
	private String raw_value;
	
	@JsonProperty
	private String name;
}
