package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(ModelMap model) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(@RequestParam String name, @RequestParam String pass, ModelMap model) {
//		boolean isValidUser = service.validateUser(name, pass);

		if (!(service.validateUser(name, pass))) {
			model.put("userInvalid", "Invalid User");
			return "login";
		}
		model.put("name", name);
		model.put("passwd", pass);
		return "welcome";
	}
}
