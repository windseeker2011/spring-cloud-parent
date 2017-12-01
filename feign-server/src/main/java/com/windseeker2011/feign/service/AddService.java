package com.windseeker2011.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.windseeker2011.feign.service.impl.AddServiceImpl;

@FeignClient(value = "ADD-SERVICE", fallback = AddServiceImpl.class)
public interface AddService {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
