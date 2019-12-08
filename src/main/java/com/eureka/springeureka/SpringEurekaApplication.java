package com.eureka.springeureka;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(scanBasePackages = "com.eureka.springeureka")
@EnableEurekaServer
@EnableDiscoveryClient
@MapperScan(value = "com.eureka.springeureka.**.dao")
public class SpringEurekaApplication {

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(SpringEurekaApplication.class, args);
	}

}
