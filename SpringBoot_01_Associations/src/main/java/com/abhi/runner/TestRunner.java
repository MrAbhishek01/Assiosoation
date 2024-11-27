package com.abhi.runner;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.abhi.entity.Person;
import com.abhi.entity.PhoneNumber;
import com.abhi.service.IService;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private IService iService;

	@Override
	public void run(String... args) throws Exception {

		Person person = new Person("Abhishek", "Satna");

		// Create PhoneNumber instances
		PhoneNumber number1 = new PhoneNumber(9131059177L, "Airtel", "PostPad");
		PhoneNumber number2 = new PhoneNumber(8358007138L, "Jio", "PrePad");

		// Associate the PhoneNumbers with the Person
		number1.setPersoninfo(person);
		number2.setPersoninfo(person);

		// Add the PhoneNumber instances to the Person's numbers set
		Set<PhoneNumber> phoneNumbers = new HashSet<>();
		phoneNumbers.add(number1);
		phoneNumbers.add(number2);

		// Set the numbers in the Person entity
		person.setNumbers(phoneNumbers);

		// Save the Person (which will cascade and save the PhoneNumbers)
		Person savedPerson = iService.saveDetails(person);
		if (savedPerson != null) {
		    System.out.println("Details successfully inserted: " + savedPerson);
		} else {
		    System.out.println("Failed to insert details.");
		}


	}

}
