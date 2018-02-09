package com.windseeker2011.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.windseeker2011.feign.service.AddService;

@RestController
public class AddController {
	@Autowired
	private AddService addService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getConfigName() {
		return addService.getConfigName();
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public Integer add() {
		return addService.add(10, 20);
	}
}
