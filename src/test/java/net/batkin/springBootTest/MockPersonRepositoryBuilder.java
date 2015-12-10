package net.batkin.springBootTest;

import java.util.ArrayList;
import java.util.List;

public class MockPersonRepositoryBuilder {

	private List<Person> people;

	public MockPersonRepositoryBuilder() {
		this.people = new ArrayList<>();
	}

	public PersonRepository build() {
		return new MockPersonRepository(people);
	}

	public MockPersonRepositoryBuilder withPerson(Person person) {
		people.add(person);
		return this;
	}
}
