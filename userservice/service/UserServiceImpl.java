package com.example.userservice.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userservice.dao.UserRepository;
import com.example.userservice.model.UserDTO;
import com.example.userservice.model.UserEntity;
import com.example.userservice.shared.UserRequestEntity;
import com.example.userservice.shared.UserResponseEntity;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	@Override
	public UserResponseEntity getUser(String userName)
	{	
		UserEntity userEntity=userRepository.findByUserName(userName);
		ModelMapper mapper=new ModelMapper();
	    mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	    return mapper.map(userEntity, UserResponseEntity.class);
	    
	}
	@Override
	public UserResponseEntity createUser(UserRequestEntity userDetails) {
	       ModelMapper mapper=new ModelMapper();
	        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	        UserDTO userDto=mapper.map(userDetails,UserDTO.class);
	        UserEntity userEntity=mapper.map(userDto, UserEntity.class);
	        userRepository.save(userEntity);
	        return mapper.map(userDto,UserResponseEntity.class);
		
	}


}
