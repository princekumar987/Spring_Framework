package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class MyController {
	
	@GetMapping(path={"save"})
	public String xyz() {
		
		return "xyz";
	}

}
