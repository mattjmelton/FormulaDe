package com.codingdojo.formulade.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.formulade.models.Race;
import com.codingdojo.formulade.models.RaceTrack;
import com.codingdojo.formulade.models.User;
import com.codingdojo.formulade.repositories.RaceRepository;
import com.codingdojo.formulade.repositories.RaceTrackRepository;
import com.codingdojo.formulade.repositories.UserRepository;

@Service
public class FormulaDeService {
	private final UserRepository userRepo;
	private final RaceRepository raceRepo;
	private final RaceTrackRepository trackRepo;
	
	public FormulaDeService(UserRepository uR, RaceRepository rR, RaceTrackRepository tR) {
		userRepo = uR;
		raceRepo = rR;
		trackRepo = tR;
	}
	//methods for data retrieval and business logic
	
	//get all users
	public List<User> findAllDrivers(){
		return userRepo.findAll();
	}
	//create user in db
	public User saveDriver(User driver) {
		return userRepo.save(driver);
	}
	//find user by id
	public User findDriverById(Long id) {
		Optional<User> u = userRepo.findById(id);
		if(u.isPresent()) {
			return u.get();
		}else {
			return null;
		}
	}
	
	//get all races
	public List<Race> findAllRaces(){
		return raceRepo.findAll();
	}
	//get One race only
	public Race findRaceById(Long id) {
		Optional<Race> foundrace = raceRepo.findById(id);
		if(foundrace.isPresent()) {
			return foundrace.get();
		}else {
			return null;
		}
	}
	
	//create race in db
	public Race saveRace(Race race) {
		return raceRepo.save(race);
	}
	
	//get all tracks
	public List<RaceTrack> findAllTracks(){
		return trackRepo.findAll();
	}
	//create a track in db
	public RaceTrack saveTrack(RaceTrack track) {
		return trackRepo.save(track);
	}
	//get/find track by id
	public RaceTrack findTrackById(Long id) {
		Optional<RaceTrack> foundtrack = trackRepo.findById(id);
		if(foundtrack.isPresent()) {
			return foundtrack.get();
		}else {
			return null;
		}
	}
	//update points for all drivers in the race
	//including pole position and most progress
	public void updatePoints(Long raceId) {
		//get the race object
		Race race = findRaceById(raceId);
		//1st place points
		User driverFirst = race.getFinish_grid_1();
		int pointsFirst = driverFirst.getDriver_points();
		pointsFirst = pointsFirst + 15;
		driverFirst.setDriver_points(pointsFirst);
		saveDriver(driverFirst);
		
		//2nd place points
		User driverSecond = race.getFinish_grid_2();
		int pointsSecond = driverSecond.getDriver_points();
		pointsSecond = pointsSecond + 12;
		driverSecond.setDriver_points(pointsSecond);
		saveDriver(driverSecond);
		
		//3rd place points
		User driverThird = race.getFinish_grid_3();
		int pointsThird = driverThird.getDriver_points();
		pointsThird = pointsThird + 10;
		driverThird.setDriver_points(pointsThird);
		saveDriver(driverThird);
		
		//4th place points
		User driverFourth = race.getFinish_grid_4();
		int pointsFourth = driverFourth.getDriver_points();
		pointsFourth = pointsFourth + 8;
		driverFourth.setDriver_points(pointsFourth);
		saveDriver(driverFourth);
		
		//5th place points
		User driverFifth = race.getFinish_grid_5();
		int pointsFifth = driverFifth.getDriver_points();
		pointsFifth = pointsFifth + 6;
		driverFifth.setDriver_points(pointsFifth);
		saveDriver(driverFifth);
		
		//6th place points
		User driverSixth = race.getFinish_grid_6();
		int pointsSixth = driverSixth.getDriver_points();
		pointsSixth = pointsSixth + 5;
		driverSixth.setDriver_points(pointsSixth);
		saveDriver(driverSixth);
		
		//7th place points
		User driverSeventh = race.getFinish_grid_7();
		int pointsSeventh = driverSeventh.getDriver_points();
		pointsSeventh = pointsSeventh + 4;
		driverSeventh.setDriver_points(pointsSeventh);
		saveDriver(driverSeventh);
		
		//8th place points
		User driverEighth = race.getFinish_grid_8();
		int pointsEighth = driverEighth.getDriver_points();
		pointsEighth = pointsEighth + 3;
		driverEighth.setDriver_points(pointsEighth);
		saveDriver(driverEighth);
		
		//9th place points
		User driverNinth = race.getFinish_grid_9();
		int pointsNinth = driverNinth.getDriver_points();
		pointsNinth = pointsNinth + 2;
		driverNinth.setDriver_points(pointsNinth);
		saveDriver(driverNinth);
		
		//10th place points
		User driverTenth = race.getFinish_grid_10();
		int pointsTenth = driverTenth.getDriver_points();
		pointsTenth = pointsTenth + 1;
		driverTenth.setDriver_points(pointsTenth);
		saveDriver(driverTenth);
		
		//Pole position points
		User pole = race.getStart_grid_1();
		int pointPole = pole.getDriver_points();
		pointPole = pointPole + 1;
		pole.setDriver_points(pointPole);
		saveDriver(pole);
		
		//Most Progress points
		//each driver's finish position minus their starting position
		//finish position to an int
		//get that driver's starting position and set to an int
		//subtract finish minus start
		//the max is most progress
		//that driver gets the point--set and save
	}
}
