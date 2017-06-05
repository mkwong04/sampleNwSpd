package com.ribbitup.networkspeed.rest.model.apiai;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class RequestData {

	@JsonProperty
	private List<Input> inputs;
	
	@JsonProperty
	private User user;
	
	@JsonProperty
	private Conversation conversation;
}
