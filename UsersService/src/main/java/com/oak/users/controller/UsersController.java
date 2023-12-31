package com.oak.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oak.users.entities.User;
import com.oak.users.service.UsersService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("users")
public class UsersController {

	@Autowired
	UsersService usersService;

	@GetMapping
	public ResponseEntity getUers() {
		List<User> users = null;
		try {
			users = usersService.getUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity(users, HttpStatus.OK);
	}

	@PostMapping("add")
	public ResponseEntity addUers(@Valid @RequestBody User users) {

		try {
			return new ResponseEntity(usersService.addUsers(users), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
