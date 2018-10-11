package com.codingdojo.formulade.controllers;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.formulade.models.Race;
import com.codingdojo.formulade.models.RaceTrack;
import com.codingdojo.formulade.models.Role;
import com.codingdojo.formulade.models.User;
import com.codingdojo.formulade.services.FormulaDeService;
import com.codingdojo.formulade.validator.UserValidator;

@Controller
public class FormulaDeController {
	private final FormulaDeService deService;
	private final UserValidator userValidate;
	
	public FormulaDeController(FormulaDeService fdS, UserValidator uV) {
		deService = fdS;
		userValidate = uV;
	}
	//registration page
	@RequestMapping("/registration")
	public String registerForm(@ModelAttribute("user")User user) {
		return "registrationPage.jsp";
	}
	//login page
	@RequestMapping("/login")
	public String login(@RequestParam(value = "error", required=false) String error, 
						@RequestParam(value="logout", required=false) String logout, Model model) {
		if(error != null) {
			model.addAttribute("errorMessage", "Invalid credentials, Please try again.");
		}
		if(logout !=null) {
			model.addAttribute("logoutMessage", "Logout Successful!");
		}
		return "loginPage.jsp";
	}
	//home route
	@RequestMapping(value= {"/","/home"})
	public String home(Principal principal, Model model) {
//		Long userId = (Long)session.getAttribute("userId");
//		User user = userServ.findUserById(userId);
//		String username = principal.getName();
//		model.addAttribute("currentUser",deService.findByUsername(username));
		return "FormulaDe.jsp";
	}
	//post route to create user
	@PostMapping("/registration")
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result) {
		userValidate.validate(user, result);
		if(result.hasErrors()) {
			return "registrationPage.jsp";
		}else {
//			deService.registerUser(user);
			deService.saveWithUserRole(user);
//			deService.saveUserWithAdminRole(user);
//			Long userId = user.getId();
//			session.setAttribute("userId", userId);
			return "redirect:/login";
		}
	}
	//route to display main page
//	@RequestMapping("/")
//	public String displayMain() {
//		return "FormulaDe.jsp";
//	}
	
	//route to display Season dashboard
	@RequestMapping("/season")
	public String displaySeason(Model model, Principal principal) {
		List<Race> showRaces = deService.findAllRaces(); //get all races
		model.addAttribute("showRaces",showRaces);		//add to model to display races
		String username = principal.getName();			//get user signed in and check role
		User user = deService.findByUsername(username);
		List<Role> role = user.getRoles();
		String driver_auth = role.get(0).getName();		//add role to model where jsp will check if admin show the add race and track buttons.
		model.addAttribute("driver", driver_auth);
		return "season.jsp";
	}
	
	//route to display Race create page
	@RequestMapping("/admin/newRace")
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
			System.out.println(result);
			return "newrace.jsp";
		}else {
			deService.saveRace(race);
			deService.updatePoints(race.getId());
			return "redirect:/season";
		}
	}
	//route to leaderboard
	@RequestMapping("/leaderboard")
	public String showLeaderboard(Model model) {
		//need to call the get leaders desc
		List<User> drivers = deService.getAllDriversByPoints();
		model.addAttribute("showDrivers", drivers);
		return "leaderboard.jsp";
	}
	
	//route to Race details
	@RequestMapping("/race/{id}")
	public String showRaceDetails(@PathVariable("id")Long id, Model model) {
		Race oneRace = deService.findRaceById(id);
		model.addAttribute("showRace", oneRace);
		return "showrace.jsp";
	}
	//route to display Track create page
	@RequestMapping("/admin/newTrack")
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
	@RequestMapping("/admin")
	public String adminPage(Principal principal, Model model) {
		String username = principal.getName();
		model.addAttribute("currentUser", deService.findByUsername(username));
		return "adminPage.jsp";
	}
	
}
