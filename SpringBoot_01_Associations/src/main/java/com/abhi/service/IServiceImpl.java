package com.abhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abhi.entity.Person;
import com.abhi.repository.PersonRepository;
import com.abhi.repository.PhoneNumberRepository;
@Service
public class IServiceImpl implements IService {
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private PhoneNumberRepository phoneNumberRepository;

	public Person saveDetails(Person person) {

		return personRepository.save(person);

	}

}
