package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class FeignController {
	@Autowired
	private FeignServiceutil feignServiceutil;
	@GetMapping("/user-name")
	public String getusername()
	{
	return feignServiceutil.getName();
	}
	@GetMapping("/user-address")
	public String getaddress()
	{
	return feignServiceutil.getaddress();
	}
	@GetMapping("/user-study")
	public String getstudy()
	{
	return feignServiceutil.getstudy();
	}
}
