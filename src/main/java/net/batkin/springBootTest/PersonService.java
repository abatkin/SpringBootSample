package net.batkin.springBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class PersonService {

	private PersonRepository personRepository;

	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public List<Person> getAllPeople() {
		return personRepository.getAllPeople();
	}

	public Person getOldestPerson() {
		return personRepository.getAllPeople().stream().max((a, b) -> b.getDateOfBirth().compareTo(a.getDateOfBirth())).orElse(null);
	}

	public Person getYoungestPerson() {
		return personRepository.getAllPeople().stream().min((a, b) -> b.getDateOfBirth().compareTo(a.getDateOfBirth())).orElse(null);
	}

}
