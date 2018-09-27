package com.codingdojo.formulade.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.formulade.models.User;
import com.codingdojo.formulade.models.Race;
import com.codingdojo.formulade.models.RaceTrack;
import com.codingdojo.formulade.services.FormulaDeService;

@Controller
public class FormulaDeController {
	private final FormulaDeService deService;
	
	public FormulaDeController(FormulaDeService fdS) {
		deService = fdS;
	}
	//registration page
	@RequestMapping("/registration")
	public String registerForm(@ModelAttribute("user")User user) {
		return "registrationPage.jsp";
	}
	//post route to create user
	@PostMapping("/registration")
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result) {
//		userValidate.validate(user, result);
		if(result.hasErrors()) {
			return "registrationPage.jsp";
		}else {
			deService.saveDriver(user);
//			userServ.saveUserWithAdminRole(user);
//			Long userId = user.getId();
//			session.setAttribute("userId", userId);
			return "redirect:/season";
		}
	}
	//route to display main page
	@RequestMapping("/")
	public String displayMain() {
		return "FormulaDe.jsp";
	}
	
	//route to display Season dashboard
	@RequestMapping("/season")
	public String displaySeason(Model model) {
		List<Race> showRaces = deService.findAllRaces();
		model.addAttribute("showRaces",showRaces);
		return "season.jsp";
	}
	
	//route to display Race create page
	@RequestMapping("/newRace")
	public String displayNewRacePage(@ModelAttribute("newRace")Race race, Model model) {
		List<RaceTrack> tracks = deService.findAllTracks();
		model.addAttribute("showTracks", tracks);
		List<User> drivers = deService.findAllDrivers();
		model.addAttribute("showDrivers", drivers);
		return "newrace.jsp";
	}
	//post route to create and save new race
	@PostMapping("/createRace")
	public String createRace(@Valid @ModelAttribute("newRace")Race race, BindingResult result) {
		if(result.hasErrors()) {
			return "newrace.jsp";
		}else {
			deService.saveRace(race);
			deService.updatePoints(race.getId());
			return "redirect:/season";
		}
	}
	
	//route to Race details
	@RequestMapping("/race/{id}")
	public String showRaceDetails(@PathVariable("id")Long id, Model model) {
		Race oneRace = deService.findRaceById(id);
		model.addAttribute("showRace", oneRace);
		return "showrace.jsp";
	}
	//route to display Track create page
	@RequestMapping("/newTrack")
	public String displayNewTrackPage(@ModelAttribute("newTrack")RaceTrack racetrack) {
		return "newtrack.jsp";
	}
	//post route to create new tracks
	@PostMapping("/createTrack")
	public String createTrack(@Valid @ModelAttribute("newTrack")RaceTrack racetrack, BindingResult result) {
		if(result.hasErrors()) {
			return "newtrack.jsp";
		}else {
			deService.saveTrack(racetrack);
			return "redirect:/season";
		}
	}
	
	
}
