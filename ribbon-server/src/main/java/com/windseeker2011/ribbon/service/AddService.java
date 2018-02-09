package com.windseeker2011.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class AddService {
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "getConfigNameFallBack")
	public String getConfigName() {
		return restTemplate.getForEntity("http://ADD-SERVICE/", String.class).getBody();
	}

	public String getConfigNameFallBack() {
		return "add-service";
	}

	@HystrixCommand(fallbackMethod = "addServiceFallBack")
	public Integer add(Integer a, Integer b) {
		return restTemplate.getForEntity(String.format("http://ADD-SERVICE/add?a=%s&b=%s", a, b), Integer.class)
				.getBody();
	}

	public Integer addServiceFallBack(Integer a, Integer b) {
		return 0;
	}
}
