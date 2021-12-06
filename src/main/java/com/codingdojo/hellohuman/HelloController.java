package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping
public class HelloController {
	@RequestMapping("/")
	public String helloHuman(@RequestParam(value="name", required=false) String searchQuery) {
		if(searchQuery == null) {
			return "Hello human!";
		}
		else {		
			return "Hello " + searchQuery;
		}
	}
	
	

}
