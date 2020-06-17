package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String user, String pass) {

		if (user.equalsIgnoreCase("arvind") && pass.equalsIgnoreCase("m")) {
			return true;
		} else {
			return false;
		}
	}
}
