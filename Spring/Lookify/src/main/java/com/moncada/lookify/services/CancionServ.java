package com.moncada.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moncada.lookify.interfaces.CancionRepo;
import com.moncada.lookify.models.Cancion;

@Service
public class CancionServ {
	private final CancionRepo cancionRepo;
	
	public CancionServ(CancionRepo cancionRepo) {
		this.cancionRepo = cancionRepo;
	}
	public List<Cancion> allCanciones(){
		return cancionRepo.findAll();
	}
	public Cancion createCancion(Cancion cancion) {
		return cancionRepo.save(cancion);
	}
	public Cancion findCancion(Long id) {
		Optional<Cancion> optionalCancion = cancionRepo.findById(id);
		if(optionalCancion.isPresent()) {
			return optionalCancion.get();
		} else {
			return null;
		}
	}
	public void deleteCancion(Long id) {
		cancionRepo.deleteById(id);
	}
	public Cancion updateCancion(Cancion cancion) {
		cancionRepo.save(cancion);
		return cancion;
	}
	
	
	
	
	
	
}
