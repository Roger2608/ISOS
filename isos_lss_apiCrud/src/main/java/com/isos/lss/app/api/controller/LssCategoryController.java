package com.isos.lss.app.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isos.lss.app.api.expose.model.Data;
import com.isos.lss.app.api.service.LssService;

@RestController
@RequestMapping(path = "/lss/category" ,produces = MediaType.APPLICATION_JSON_VALUE)
public class LssCategoryController {
	
	@Autowired
	LssService lssService;
	
	@GetMapping(path = "/list/name/{nameCategory}")
	public List<Data> getByName(@PathVariable(name = "nameCategory" ) String nameCategory) {
		return lssService.findAll();
	}
	
}
