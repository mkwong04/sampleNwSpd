package com.ribbitup.networkspeed.rest.model.apiai;

import java.util.List;
import java.util.Properties;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Result {

	@JsonProperty
	private Properties parameters;
	
	@JsonProperty
	private List<ContextObj> contexts;
	
	@JsonProperty
	private String resolvedQuery;
	
	@JsonProperty
	private String source;
	
	@JsonProperty
	private double score;
	
	@JsonProperty
	private String speech;
	
	@JsonProperty
	private Fulfillment fulfillment;
	
	@JsonProperty
	private boolean actionIncomplete;
	
	@JsonProperty
	private String action;
	
	@JsonProperty
	private Metadata metadata; 
}
