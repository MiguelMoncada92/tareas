package com.moncada.dojosNinjasServices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moncada.dojosNinjasModels.Dojo;
import com.moncada.dojosNinjasRepositories.DojoRepo;

@Service
public class DojoServ {
	private final DojoRepo dojoRepo;
	
	public DojoServ(DojoRepo dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	public List<Dojo> allDojo(){
		return dojoRepo.findAll();
	}
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> optDojo = dojoRepo.findById(id);
		if(optDojo.isPresent()) {
			return optDojo.get();
		} else {
			return null;
		}
	}
	
	public void deleteDojo(Long id) {
		dojoRepo.deleteById(id);
	}
	
	public Dojo updateDojo(Dojo dojo) {
		dojoRepo.save(dojo);
		return dojo;
	}
	
	
	
	
	
}
