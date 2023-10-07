package com.oak.users.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oak.users.entities.Users;
import com.oak.users.repositories.UsersRepository;
import com.oak.users.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	UsersRepository repository;

	@Override
	public List<Users> getUsers() throws Exception {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Users addUsers(Users users) throws Exception {
		// TODO Auto-generated method stub
		users.setUserId(UUID.randomUUID().toString());
		return repository.save(users);
	}
	

}
