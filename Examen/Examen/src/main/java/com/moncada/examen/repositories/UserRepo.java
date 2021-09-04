package com.moncada.examen.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.moncada.examen.models.User;

public interface UserRepo extends CrudRepository<User, Long> {
	User findByUsername(String username);
	List<User> findAll();
}
