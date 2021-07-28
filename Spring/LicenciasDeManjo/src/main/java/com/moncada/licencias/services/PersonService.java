package com.moncada.licencias.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moncada.licencias.models.Person;
import com.moncada.licencias.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public List<Person> allPersons(){
		return personRepository.findAll();
	}
	
	public Person createPerson(Person p1) {
		return personRepository.save(p1);
	}
	
	public Person findPerson(Long id) {
		Optional<Person> optionalPerson = personRepository.findById(id);
		if(optionalPerson.isPresent()) {
			return optionalPerson.get();
		} else {
			return null;
		}
	}
	
	public void deletePerson(Long id) {
		personRepository.deleteById(id);
	}
	public Person updatePerson(Person person) {
		personRepository.save(person);
		return person;
	}
	
	
	
	
}
