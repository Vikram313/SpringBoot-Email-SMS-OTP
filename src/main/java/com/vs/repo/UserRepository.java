package com.vs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vs.model.User;
/**
 * @author shrisowdhaman
 * Dec 14, 2017
 */
public interface UserRepository extends JpaRepository<User, Long>{
	
	 User findByUsername(String username);

}
