package com.dxc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.document.Users;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
