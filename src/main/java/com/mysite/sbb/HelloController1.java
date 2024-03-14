package com.mysite.sbb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController1 {

	private final UserService userService;
	
	@Autowired
	public HelloController1(UserService userService) {
		this.userService = userService;
	}
	
	// localhost:8080/hihi
	@GetMapping("/hihi")
	public String hihi() {
		String user = userService.userHello();
		return user;
	}
}
