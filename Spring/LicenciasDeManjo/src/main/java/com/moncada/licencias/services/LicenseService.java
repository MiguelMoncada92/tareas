package com.moncada.licencias.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moncada.licencias.models.License;
import com.moncada.licencias.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository licenseRepository;
	
	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	public List<License> allLicense(){
		return licenseRepository.findAll();
	}
	
	public License createLicense(License l1) {
		return licenseRepository.save(l1);
	}
	
	public License findLicense(Long id) {
		Optional<License> optionalLicense = licenseRepository.findById(id);
		if(optionalLicense.isPresent()) {
			return optionalLicense.get();
		} else {
			return null;
		}
	}
	
	public void deleteLicense(Long id) {
		licenseRepository.deleteById(id);
	}
	public License updateLicense(License license) {
		licenseRepository.save(license);
		return license;
	}
	
	
	
	
}
