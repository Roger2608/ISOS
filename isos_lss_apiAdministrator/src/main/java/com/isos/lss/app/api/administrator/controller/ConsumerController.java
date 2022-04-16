package com.isos.lss.app.api.administrator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isos.lss.app.api.administrator.consumer.api.ApiConsumesService;
import com.isos.lss.app.api.administrator.consumer.response.ConsumerResponse;

@RestController
@RequestMapping(path = "isos/admin")
public class ConsumerController {
	
	@Autowired
	ApiConsumesService consumer;
	
	@GetMapping(path = "/execute/{batch}")
	public ConsumerResponse executeBatch(@PathVariable(name = "batch") String batch) {
		return consumer.consummerApiRestExternal(batch);
	}

}
