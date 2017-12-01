package com.windseeker2011.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.windseeker2011.ribbon.service.AddService;

@RestController
public class AddController {
	@Autowired
	private AddService addService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public Integer add() {
		return addService.add();
	}
}
