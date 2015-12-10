package net.batkin.springBootTest;

import java.util.List;

public class ListOfPeople {

	private List<Person> people;

	public ListOfPeople(List<Person> people) {
		this.people = people;
	}

	public List<Person> getPeople() {
		return people;
	}
}
