package com.isos.lss.app.api.administrator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApiAdministratorConfig {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
