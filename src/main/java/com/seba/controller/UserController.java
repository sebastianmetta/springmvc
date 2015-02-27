package com.seba.controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.seba.model.User;
import com.seba.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Inject
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(method = RequestMethod.GET, params = "new")
	public String createSpitterProfile(Model model) {
		model.addAttribute(new User());
		return "users/edit";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String addSpitterFromForm(User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "users/edit";
		}
		userService.saveUser(user);
		return "redirect:/users/" + user.getUsername();
	}
	
	@RequestMapping(value="/{username}", method=RequestMethod.GET)
	public String showSpitterProfile(@PathVariable String username,	Model model) {
		model.addAttribute(userService.getUser(username));
		return "users/view";
	}

}
