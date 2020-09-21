package com.terry.phan.microservice.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClientServiceApplication.class, args);
	}

	@Value("${spring.application.name}")
	private String applicationName;

	@Value(("${server.port}"))
	private String port;

	@Autowired
	HttpServletRequest request;

	@GetMapping("greeting")
	public String greeting() throws UnknownHostException {

		String ip4Address = Inet4Address.getLocalHost().getHostAddress();
		return String.format("%s (IP: %s) using port %s", applicationName, ip4Address, port);
	}
}
