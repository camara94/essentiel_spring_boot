package com.linkedin.web;



import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.linkedin.data.User;
import com.linkedin.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService personService) {
		this.userService = personService;
	}


	@GetMapping("users")
	public String getUsers(Model model) {

		List<User> users = userService.getAllUsers();
		
		model.addAttribute("users", users);
		return "UserView";
	}
	

}
