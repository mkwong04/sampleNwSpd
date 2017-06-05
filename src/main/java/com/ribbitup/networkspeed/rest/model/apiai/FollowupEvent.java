package com.ribbitup.networkspeed.rest.model.apiai;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FollowupEvent {
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private Map<String,String> data;
}
