package examples.io.exercise;

import java.util.List;

import examples.io.Person;

public class Controller {
	private PeopleRepository peopleRepository;

	public Controller(PeopleRepository peopleRepository) {
		this.peopleRepository = peopleRepository;
	}
	
	public List<Person> selectAll(){
		return peopleRepository.readPeople();
	}
}
