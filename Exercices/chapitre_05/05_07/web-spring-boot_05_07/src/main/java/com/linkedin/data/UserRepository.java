package com.linkedin.data;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
	
	
	public Collection<User> findByLastName(String lastName);
	
	

}
