package com.codingdojo.formulade.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.formulade.models.Race;

@Repository
public interface RaceRepository extends CrudRepository<Race, Long>{
	//methods to get data from the DB
	List<Race> findAll();
}
