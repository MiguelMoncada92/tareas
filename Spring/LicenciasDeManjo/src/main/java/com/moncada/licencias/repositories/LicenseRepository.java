package com.moncada.licencias.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.moncada.licencias.models.License;

public interface LicenseRepository extends CrudRepository<License, Long>{
	List<License> findAll();
}
