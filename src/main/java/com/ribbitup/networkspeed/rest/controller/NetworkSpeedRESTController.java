package com.ribbitup.networkspeed.rest.controller;

import java.util.Properties;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ribbitup.networkspeed.rest.model.apiai.APIAIRequest;
import com.ribbitup.networkspeed.rest.model.apiai.APIAIResponse;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path="/nwspd")
@Slf4j
public class NetworkSpeedRESTController {
	
	static final Properties CITY_SPEED = new Properties();
	
	{
		CITY_SPEED.put("TOKYO", "1 Gbps");
		CITY_SPEED.put("HONG KONG", "1 Gbps");
		CITY_SPEED.put("SINGAPORE", "10 Gbps");
		CITY_SPEED.put("JAkARTA", "1 Gbps");
	}

	/**
	 * 
	 * @param request
	 * @return
	 */
	@CrossOrigin(origins={"*"}, 
			     methods={RequestMethod.POST},
			     allowedHeaders={"origin", "content-type", "accept", "authorization"})
	/** Swagger UI **/
	@ApiOperation(value="Average Network Speed",
	 	          notes="Average Network Speed",
				  consumes = MediaType.APPLICATION_JSON_VALUE,
				  produces = MediaType.APPLICATION_JSON_VALUE,
				  tags = {"Network Speed"})
	
	@RequestMapping(path="/avgnetworkspeed",
					method=RequestMethod.POST,
					consumes={"application/json"},  
					produces={"application/json"})
	public ResponseEntity<APIAIResponse> getAverageNetworkSpeed(@RequestBody APIAIRequest request){
		
		if(request.getResult()==null || !"Average Speed Inquiry".equalsIgnoreCase(request.getResult().getAction())){
			log.warn("Action not supported {}",request.getResult().getAction());
			return ResponseEntity.badRequest().build();
		}
		
		String location = request.getResult().getParameters().getProperty("location");

		log.info("Retrieving for location : {}",location);
		
		if(location ==null){
			log.warn("No Location Specified");
			return ResponseEntity.badRequest().build();
		}
		//TODO: look up db
		String avgSpeed = (String)CITY_SPEED.get(location.toUpperCase());
		
		String resultText;
		
		if(avgSpeed == null){
			resultText="No network speed information for "+location;
		}
		else{
			resultText = String.format("Average network speed for %s is %s",location, avgSpeed);
		}
		
		APIAIResponse response = APIAIResponse.builder()
											  .speech(resultText)
											  .displayText(resultText)
											  .build();
		
		return ResponseEntity.ok(response);
	}
}
