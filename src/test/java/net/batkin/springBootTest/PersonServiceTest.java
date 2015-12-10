package net.batkin.springBootTest;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;


public class PersonServiceTest {

	private PersonService personService;

	@Before
	public void setUp() {
		PersonRepository personRepository = new MockPersonRepositoryBuilder()
				.withPerson(new Person("First1", "Last1", 12))
				.withPerson(new Person("First2", "Last2", 91))
				.withPerson(new Person("First3", "Last3", 54))
				.build();
		this.personService = new PersonService(personRepository);
	}

	@Test
	public void testGetAllPeople() throws Exception {
		assertThat(personService.getAllPeople().size(), equalTo(3));
	}

	@Test
	public void testGetOldestPerson() throws Exception {
		Person oldestPerson = personService.getOldestPerson();
		assertThat(oldestPerson, is(notNullValue()));
		assertThat(oldestPerson.getAge(), equalTo(91));
	}

	@Test
	public void testGetYoungestPerson() throws Exception {
		Person youngestPerson = personService.getYoungestPerson();
		assertThat(youngestPerson, is(notNullValue()));
		assertThat(youngestPerson.getAge(), equalTo(12));
	}
}
