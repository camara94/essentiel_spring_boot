package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.User;
@Service
public class UserService {
	
	public List<User> getListUsers() {
		List<User> users = new ArrayList<User>();
		users.add( new User("Laby Damaro", "CAMARA") );
		users.add( new User("M'balou", "SACKO" ) );
		users.add( new User("Moussa", "CAMARA") );
		users.add( new User("Ousmane", "KOULIBALY" ) );
		return users;
	}
}
