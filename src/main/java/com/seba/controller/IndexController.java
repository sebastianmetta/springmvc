package com.seba.controller;

import java.util.Map;

import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.seba.service.UserService;

/**
 * Handles requests for the application index page.
 */
@Controller
public class IndexController {

	@Autowired
	private UserService userService;

	@Inject
	public IndexController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping({"/","/index"})
	 public String showIndexPage(Map<String, Object> model) {
	 //This method handles requests whose path is either / or /home.
	 //Args could be anithing such as Http request, response, String, etc.
	 model.put("users", userService.listUsers());
	 //Returns the logical name of the view that should render the result,
	 //wich ViewResolver solves.
	 return "index";
	 }

}
