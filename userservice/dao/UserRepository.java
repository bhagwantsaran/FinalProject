package com.example.userservice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.userservice.model.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Integer> {
	UserEntity findByUserName(String userName);		
}
