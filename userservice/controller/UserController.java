package com.example.userservice.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.userservice.model.UserDTO;
import com.example.userservice.model.UserEntity;
import com.example.userservice.service.UserService;
import com.example.userservice.shared.UserRequestEntity;
import com.example.userservice.shared.UserResponseEntity;

@RestController
public class UserController {
		@Autowired
		UserService userService;
		
		@RequestMapping(value="/user/{userName}",method = RequestMethod.GET)
		public UserResponseEntity getUser(@PathVariable String userName) throws Exception
		{
			return userService.getUser(userName);
		}
		@RequestMapping(value="/user/",method = RequestMethod.POST)
	    public UserResponseEntity createUser(@RequestBody UserRequestEntity userDetails)
	    {

	        return userService.createUser(userDetails);
	    }

}
