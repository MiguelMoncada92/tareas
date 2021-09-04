package com.moncada.examen.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moncada.examen.models.Role;

public interface RoleRepo extends CrudRepository<Role, Long>{
	
}
