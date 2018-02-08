package com.windseeker2011.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * spring-cloud-config服务端
 * 
 * @author Weihai Li
 *
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
		// new
		// SpringApplicationBuilder(SpringCloudConfigServerApplication.class).web(true).run(args);
	}

}
