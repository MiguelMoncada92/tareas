package com.moncada.dojosNinjasServices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moncada.dojosNinjasModels.Ninja;
import com.moncada.dojosNinjasRepositories.NinjaRepo;

@Service
public class NinjaServ {
	private final NinjaRepo ninjaRepo;
	
	public NinjaServ(NinjaRepo ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public List<Ninja> allNinja(){
		return ninjaRepo.findAll();
		
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> optNinja = ninjaRepo.findById(id);
		if(optNinja.isPresent()) {
			return optNinja.get();
		} else {
			return null;
		}
	}
	
	public void deleteNinja (Long id) {
		ninjaRepo.deleteById(id);
	}
	public Ninja updateNinja(Ninja ninja) {
		ninjaRepo.save(ninja);
		return ninja;
	}
	
	
	
	
}
