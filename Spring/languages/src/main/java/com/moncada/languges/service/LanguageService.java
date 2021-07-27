package com.moncada.languges.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.moncada.languges.models.Languages;
import com.moncada.languges.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository languageRepository;
	
	public LanguageService (LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	public List<Languages> allLanguages(){
		return languageRepository.findAll();
	}
	public Languages createLanguage(Languages l) {
        return languageRepository.save(l);
    }
    //Obteniendo la información de un lenguage
    public Languages findLanguage(Long id) {
        Optional<Languages> optionalLang = languageRepository.findById(id);
        if(optionalLang.isPresent()) {
            return optionalLang.get();
        } else {
            return null;
        }
    }
	public void deleteLanguage(Long id) {
		languageRepository.deleteById(id);
	}
	
	/*public Languages updateLanguage(Long id, String title, String desc, String lang, Integer numOfPages) {
		Optional<Languages> l = languageRepository.findById(id);
		l.get().set(title);
		l.get().setDescription(desc);
		l.get().setLanguage(lang);
		l.get().setNumberOfPages(numOfPages);
		return languageRepository.save(l.get());
	}*/
	
	public Languages updateLanguage(Languages languages) {
		languageRepository.save(languages);
		return languages;
	}
	
}
