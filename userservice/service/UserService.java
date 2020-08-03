package com.example.userservice.service;

import com.example.userservice.model.UserDTO;
import com.example.userservice.model.UserEntity;
import com.example.userservice.shared.UserRequestEntity;
import com.example.userservice.shared.UserResponseEntity;

public interface UserService {
	UserResponseEntity getUser(String userName);

	UserResponseEntity createUser(UserRequestEntity userDetails);

	
}
