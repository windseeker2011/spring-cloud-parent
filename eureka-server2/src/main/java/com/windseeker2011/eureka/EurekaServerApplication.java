package com.windseeker2011.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server服务端
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
