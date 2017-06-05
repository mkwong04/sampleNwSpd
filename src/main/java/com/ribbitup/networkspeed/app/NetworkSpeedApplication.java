package com.ribbitup.networkspeed.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.ribbitup.networkspeed.app.config.AppConfig;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * Network Speed application
 *
 */
@SpringBootApplication(scanBasePackages = {"com.ribbitup.networkspeed.rest.controller"})
@Slf4j
public class NetworkSpeedApplication {

	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		
		log.info("Starting standalone spring boot application");
		
		//build a spring application with config/component class and run with arguments
		new SpringApplicationBuilder(NetworkSpeedApplication.class).sources(AppConfig.class)
																   .run(args);
	}
}
