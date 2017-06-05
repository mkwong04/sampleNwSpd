package com.ribbitup.networkspeed.rest.model.apiai;

import java.util.List;
import java.util.Properties;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class APIAIResponse {

	@JsonProperty
	private String speech;
	
	@JsonProperty
	private String displayText;
	
	@JsonProperty
	private Properties data;
	
	@JsonProperty
	private List<ContextObj> contextOut;
	
	@JsonProperty
	private String source;
	
	@JsonProperty
	private FollowupEvent followupEvent;
}
