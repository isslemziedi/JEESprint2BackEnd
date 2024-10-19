package com.isslem.users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isslem.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);

}
