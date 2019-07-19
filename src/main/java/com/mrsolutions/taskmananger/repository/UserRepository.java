package com.mrsolutions.taskmananger.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mrsolutions.taskmananger.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}