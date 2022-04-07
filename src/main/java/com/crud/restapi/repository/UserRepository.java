package com.crud.restapi.repository;

import java.util.Optional;

import org.springframework.data.couchbase.repository.CouchbaseRepository;

import com.crud.restapi.model.User;

public interface UserRepository extends CouchbaseRepository<User, String> {

	Optional<User> findByEmailAndMobNo(String email, String mobNo);

}
