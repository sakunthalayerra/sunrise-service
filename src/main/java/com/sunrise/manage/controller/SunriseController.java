package com.sunrise.manage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/rise")
public class SunriseController {
	
	@GetMapping("/sunrise")
	public String Sunrise() {
		return "early morning";
	}

}
