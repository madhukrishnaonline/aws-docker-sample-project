package com.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.UserEntity;

@RestController
public class UserController {

	@PostMapping("/register")
	public ResponseEntity<UserEntity> registerEmployee(@RequestBody UserEntity entity) {
		return new ResponseEntity<UserEntity>(entity, HttpStatus.CREATED);
	}

	@GetMapping("/user/{name}")
	public String wishMessage(@PathVariable String name) {
		return "HI! " + name + ", You're Accessing this Spring Boot Rest API from AWS Cloud";
	}
}
