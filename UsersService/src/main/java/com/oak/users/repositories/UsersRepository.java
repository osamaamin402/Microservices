package com.oak.users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oak.users.entities.User;

@Repository
public interface UsersRepository extends JpaRepository<User, String>{

}
