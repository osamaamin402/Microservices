package com.oak.users.service;

import java.util.List;

import com.oak.users.entities.User;

public interface UsersService {

	public List<User> getUsers()throws Exception;

	public User addUsers(User users)throws Exception;
}
