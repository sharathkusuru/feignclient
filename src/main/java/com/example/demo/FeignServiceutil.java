package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="demo",url="http://localhost:8082/user")
public interface FeignServiceutil {

	@GetMapping("/name")
	String getName();
	@GetMapping("/address")
	String getaddress();
	@GetMapping("/study")
	String getstudy();
}
