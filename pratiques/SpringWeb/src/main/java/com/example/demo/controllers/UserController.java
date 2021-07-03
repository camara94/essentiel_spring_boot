package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping( path="/users" )
	public String getAllUsers( Model model ) {
		List<User> users = this.userService.getListUsers();
		model.addAttribute("users", users);
		return "usersView";
	}
	
}
