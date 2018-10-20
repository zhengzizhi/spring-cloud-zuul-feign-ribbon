package com.contoso.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@Value("${server.port}")
	String port;

	@RequestMapping("/hi")
	public String message(@RequestParam(value = "name", defaultValue = "World") String name) {
		String greeting = "Node3 hello " + name + " ,this message is from port:" + port;
		return greeting;
	}
}
