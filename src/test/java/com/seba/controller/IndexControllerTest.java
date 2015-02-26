package com.seba.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.seba.controller.IndexController;
import com.seba.model.User;
import com.seba.service.UserService;

import org.junit.Test;
import org.mockito.Mockito;


public class IndexControllerTest {

	@Test
	public void shouldDisplayUsers() {
		List<User> expectedUsers = java.util.Arrays.asList(
				new User("User 1","mail1@mail.com"), 
				new User("User 2", "mail2@mail.com"),
				new User("User 3", "mail3@mail.com"));
		
		UserService userService = Mockito.mock(UserService.class);
		Mockito.when(userService.listUsers()).thenReturn(expectedUsers);
		
		IndexController indexController = new IndexController(userService);
		Map<String, Object> model = new HashMap<String, Object>();
		String viewName = indexController.showIndexPage(model);
		assertEquals("index", viewName);
	
		assertSame(expectedUsers, model.get("users"));
	}
}
