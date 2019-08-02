package com.mrsolutions.taskmanangersts.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.mrsolutions.taskmanangersts.domain.User;

@Controller
public class UserController {

	@GetMapping(value = "/users")
	public ResponseEntity<List<User>> findAll() {
		User moises = new User("1", "Moisés Junior", "moises.rsjr@gmail.com");
		User arthur = new User("2", "Arthur Henrique", "arthurhenrique@gmail.com");
		User anajulia = new User("3", "Ana Julia", "anajulia@gmail.com");
		User andrea = new User("4", "Andrea", "andrea@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(moises, arthur,anajulia,andrea));
		return ResponseEntity.ok(list);
	}
}
