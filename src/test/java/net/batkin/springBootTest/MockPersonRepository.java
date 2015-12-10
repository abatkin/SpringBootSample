package net.batkin.springBootTest;

import java.util.List;

public class MockPersonRepository implements PersonRepository {

	private List<Person> people;

	public MockPersonRepository(List<Person> people) {
		this.people = people;
	}

	@Override
	public List<Person> getAllPeople() {
		return people;
	}
}
