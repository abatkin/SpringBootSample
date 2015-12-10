package net.batkin.springBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
		return personRepository.getAllPeople().stream().max((a, b) -> Integer.compare(a.getAge(), b.getAge())).orElse(null);
	}

	public Person getYoungestPerson() {
		return personRepository.getAllPeople().stream().min((a, b) -> Integer.compare(a.getAge(), b.getAge())).orElse(null);
	}

}
