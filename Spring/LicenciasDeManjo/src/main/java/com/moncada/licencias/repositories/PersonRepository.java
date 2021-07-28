package com.moncada.licencias.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.moncada.licencias.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{
	List<Person> findAll();
}
