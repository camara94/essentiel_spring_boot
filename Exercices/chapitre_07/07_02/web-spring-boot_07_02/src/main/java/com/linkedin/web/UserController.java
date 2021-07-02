package com.linkedin.web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linkedin.data.User;
import com.linkedin.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}


	@GetMapping
	public List<User> getUsers() {
		return userService.findAllUsers();
	}

	@PostMapping
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}

	@GetMapping(path = "{id}")
	public User getUserById(@PathVariable("id") Long id) {
		return userService.findUserById(id);
	}

	@DeleteMapping(path = "{id}")
	public void deleteUserById(@PathVariable("id") Long id) {
		userService.deleteUserById(id);
	}

	@PutMapping
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}

}
