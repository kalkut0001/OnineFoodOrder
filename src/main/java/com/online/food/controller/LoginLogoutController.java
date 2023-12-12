package com.online.food.controller;

import com.online.food.exception.LoginException;
import com.online.food.model.LoginDTO;
import com.online.food.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class LoginLogoutController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/login")
	public ResponseEntity<String> logIn(@RequestBody LoginDTO loginDTO) throws LoginException {
		String result = loginService.loginAccount(loginDTO);
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

	@PostMapping("/logout")
	public ResponseEntity<String> logout(@RequestParam(required = false) String role,
			@RequestParam(required = false) String key) throws LoginException {
		String result = loginService.logoutAccount(role, key);
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

}
