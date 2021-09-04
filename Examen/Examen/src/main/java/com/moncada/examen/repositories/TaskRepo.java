package com.moncada.examen.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.moncada.examen.models.Task;


public interface TaskRepo extends CrudRepository<Task, Long>{
	List<Task> findAll();
}
