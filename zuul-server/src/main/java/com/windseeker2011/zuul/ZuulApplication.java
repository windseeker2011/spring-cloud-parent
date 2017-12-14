package com.windseeker2011.zuul;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul服务网关
 *
 */
@EnableZuulProxy
@SpringCloudApplication
public class ZuulApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
	}
}
