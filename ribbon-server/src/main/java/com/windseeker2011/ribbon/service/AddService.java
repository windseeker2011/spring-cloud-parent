package com.windseeker2011.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class AddService {
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "addServiceFallBack")
	public Integer add() {
		return restTemplate.getForEntity("http://ADD-SERVICE/add?a=10&b=20", Integer.class).getBody();
	}
	
	public Integer addServiceFallBack() {
		return 0;
	}
}
