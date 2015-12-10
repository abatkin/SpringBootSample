package net.batkin.springBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/services")
public class SampleController {

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "/sayHello/{user}", method = RequestMethod.GET)
	public String sayHello(@PathVariable("user") String user) {
		return "Hello " + user;
	}

	@RequestMapping(value = "/listPeople", method = RequestMethod.GET)
	public ListOfPeople listPeople() {
		return new ListOfPeople(personService.getAllPeople());
	}

	@RequestMapping(value = "/oldest", method = RequestMethod.GET)
	public Person getOldestPerson() {
		return personService.getOldestPerson();
	}

	@RequestMapping(value = "/youngest", method = RequestMethod.GET)
	public Person getYoungestPerson() {
		return personService.getYoungestPerson();
	}
}
