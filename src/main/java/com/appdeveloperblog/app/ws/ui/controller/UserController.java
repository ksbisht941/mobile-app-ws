package com.appdeveloperblog.app.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;

@RestController
@RequestMapping("users") // https:localhost:8080/users
public class UserController {
	
	@GetMapping
	public String getUSers() {		
		return "get user was called";
	}
	
	@PostMapping
	public String createUser(@RequestBody UserDetailsRequestModel userDetails) {
		return "create user was called";
	}
	
	@PutMapping
	public String updateUser() {
		return "update user was called";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user was called";
	}
}
