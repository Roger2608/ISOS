package com.isos.lss.app.api.administrator.consumer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.isos.lss.app.api.administrator.consumer.response.ConsumerResponse;

@Component
public class ApiConsumesService {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${api.batch.url}")
	String apiRestConsummerUrlBase;
	
	public ConsumerResponse consummerApiRestExternal(String api) {
		ConsumerResponse consumerResponse = restTemplate.getForObject(apiRestConsummerUrlBase.concat(api).toString(), ConsumerResponse.class);
		return consumerResponse;
	}
}
