package com.ribbitup.networkspeed.rest.model.apiai;

import java.util.Properties;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ContextObj {
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private Properties parameters;
	
	@JsonProperty
	private int lifespan;
}
