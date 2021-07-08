package com.zjtech.serviceprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderApplication.class, args);
	}

	@Value("${server.port}")
	String port;

	@GetMapping("/hi")
	public String sayHi(@RequestParam(value = "name", defaultValue = "lz",required = false) String name) {
		return "hello " + name + ", i'm provider ,my port:" + port;
	}
}
