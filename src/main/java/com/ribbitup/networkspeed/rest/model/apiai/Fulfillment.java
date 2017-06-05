package com.ribbitup.networkspeed.rest.model.apiai;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Fulfillment {
	
	@JsonProperty
	private List<Message> messages;

	@JsonProperty
	private String speech;
}
