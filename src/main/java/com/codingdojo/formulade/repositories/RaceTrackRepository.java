package com.codingdojo.formulade.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.formulade.models.RaceTrack;

@Repository
public interface RaceTrackRepository extends CrudRepository<RaceTrack, Long> {
	List<RaceTrack> findAll();
}
