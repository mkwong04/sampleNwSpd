package com.ribbitup.networkspeed.rest.model.apiai;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Conversation {

	@JsonProperty
	private String conversation_id;
	
	@JsonProperty
	private int type;
	
	@JsonProperty
	private List<String> conversation_token;
}
