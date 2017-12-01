package com.windseeker2011.feign.service.impl;

import org.springframework.stereotype.Component;

import com.windseeker2011.feign.service.AddService;

@Component
public class AddServiceImpl implements AddService {

	@Override
	public Integer add(Integer a, Integer b) {
		return 0;
	}

}
