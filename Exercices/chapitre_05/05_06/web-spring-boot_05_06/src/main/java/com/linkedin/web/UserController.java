package com.linkedin.web;



import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linkedin.data.User;
import com.linkedin.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService personService) {
		this.userService = personService;
	}


	@GetMapping("users")
	public List<User> getUsers() {

		return userService.getAllUsers();
		
		
	}
	

}
