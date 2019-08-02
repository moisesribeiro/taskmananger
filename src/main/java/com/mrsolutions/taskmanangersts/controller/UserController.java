package com.mrsolutions.taskmanangersts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.mrsolutions.taskmanangersts.domain.User;
import com.mrsolutions.taskmanangersts.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;

	@GetMapping(value = "/users")
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok(list);
	}
}