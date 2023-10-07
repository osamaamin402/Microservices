package com.oak.users.service;

import java.util.List;

import com.oak.users.entities.Users;

public interface UsersService {

	public List<Users> getUsers()throws Exception;

	public Users addUsers(Users users)throws Exception;
}
