package com.ribbitup.networkspeed.rest.model.apiai;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class RawInput {

	@JsonProperty
	private String query;
	
	@JsonProperty
	private int input_type;
}
