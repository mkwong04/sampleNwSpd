package com.ribbitup.networkspeed.rest.model.apiai;
 
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Input {

	@JsonProperty
	private List<RawInput> raw_inputs;
	
	@JsonProperty
	private String intent;
	
	@JsonProperty
	private List<Argument> arguments;
}
