package com.codingdojo.formulade.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.formulade.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	//methods to get data from the DB
	List<User> findAll();
	
	User findByUsername(String username);
	
	@Query(value="SELECT * FROM users ORDER BY driver_points DESC", nativeQuery=true)
	List<User> findAllByDriverPointsDesc();
}
