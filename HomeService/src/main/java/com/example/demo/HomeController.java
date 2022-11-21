package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	@Autowired
	private RestTemplate res;
	@GetMapping("/home")
	public String home()
	{
		return res.getForObject("http://PRODUCTS-MICROSERVICE/products", String.class);
	}

}
