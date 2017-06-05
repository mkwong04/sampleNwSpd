package com.ribbitup.networkspeed.rest.model.apiai;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Metadata {

	@JsonProperty
	private String intendId;
	
	@JsonProperty
	private boolean webhookForSlotFillingUsed; 
	
	@JsonProperty
	private String  intenName;
	
	@JsonProperty
	private String webhookUsed;
}
