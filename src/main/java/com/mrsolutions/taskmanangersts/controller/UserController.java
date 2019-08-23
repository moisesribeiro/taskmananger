package com.mrsolutions.taskmanangersts.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mrsolutions.taskmanangersts.domain.User;
import com.mrsolutions.taskmanangersts.dto.UserDTO;
import com.mrsolutions.taskmanangersts.services.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping(produces = "application/json" )
 	public ResponseEntity<List<UserDTO>> findAll() {
		List<User> list = service.findAll();
		List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	 
	@GetMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<UserDTO> findById(@PathVariable String id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(new UserDTO(obj));
	}
}
