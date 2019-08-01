package com.mrsolutions.taskmanangersts.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mrsolutions.taskmanangersts.domain.User;

@RestController
@RequestMapping(value = "/users")

public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User moises = new User("1", "Moisés Junior", "moises.rsjr@gmail.com");
		User arthur = new User("2", "Arthur Henrique", "arthurhenrique@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(moises, arthur));
		return ResponseEntity.ok().body(list);
	}
}
