package com.saran.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 
public class SaranController {
	
	
	@GetMapping("/")
	public String myBusinessLogic() {
		return "<h1 style=color:blue>Welcome to my BusinessLogic One</h1>";
	}
	
	 
}
