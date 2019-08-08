package com.mrsolutions.taskmanangersts.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrsolutions.taskmanangersts.domain.User;
import com.mrsolutions.taskmanangersts.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();

	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(null);
	}
}
