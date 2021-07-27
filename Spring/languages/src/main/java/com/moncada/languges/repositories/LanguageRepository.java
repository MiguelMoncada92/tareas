package com.moncada.languges.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.moncada.languges.models.*;

public interface LanguageRepository extends CrudRepository<Languages, Long> {
	List<Languages> findAll();
}
