package com.fubon.docker.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fubon.docker.entity.Test;

@Repository
public interface TestRepository extends MongoRepository<Test, String> {
	
}

