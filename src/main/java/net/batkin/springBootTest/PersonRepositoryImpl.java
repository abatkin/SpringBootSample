package net.batkin.springBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonRepositoryImpl implements PersonRepository {

	@Autowired
	private JdbcTemplate jt;


	@Override
	public List<Person> getAllPeople() {
		return jt.query("SELECT FirstName, LastName, DateOfBirth FROM Person", new BeanPropertyRowMapper(Person.class));
	}
}
