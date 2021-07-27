package com.moncada.lookify.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.moncada.lookify.models.Cancion;

@Repository
public interface CancionRepo extends CrudRepository<Cancion, Long> {
	List<Cancion> findAll();
}
