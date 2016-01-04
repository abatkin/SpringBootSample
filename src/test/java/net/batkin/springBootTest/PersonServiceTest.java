package net.batkin.springBootTest;

import net.batkin.springBootTest.util.DateUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;


public class PersonServiceTest {

	private PersonService personService;

	@Before
	public void setUp() {
		PersonRepository personRepository = new MockPersonRepositoryBuilder()
				.withPerson(new Person("First1", "Last1", DateUtil.getDate(1970, Calendar.DECEMBER, 21)))
				.withPerson(new Person("First2", "Last2", DateUtil.getDate(1960, Calendar.DECEMBER, 21)))
				.withPerson(new Person("First3", "Last3", DateUtil.getDate(1980, Calendar.DECEMBER, 21)))
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
		assertThat(oldestPerson.getDateOfBirth(), equalTo(DateUtil.getDate(1960, Calendar.DECEMBER, 21)));
	}

	@Test
	public void testGetYoungestPerson() throws Exception {
		Person youngestPerson = personService.getYoungestPerson();
		assertThat(youngestPerson, is(notNullValue()));
		assertThat(youngestPerson.getDateOfBirth(), equalTo(DateUtil.getDate(1980, Calendar.DECEMBER, 21)));
	}
}
