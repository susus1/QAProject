package examples.io.exercise;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import examples.io.Person;

@RunWith(MockitoJUnitRunner.class)
public class ControllerMockTest {
	
	@Mock
	private PeopleRepository peopleRepository;

	@Test
	public void test() {
		Controller controller = new Controller(peopleRepository);
		List<Person> people = getPeople();
		when(peopleRepository.readPeople()).thenReturn(people);
		assertEquals(3, controller.selectAll().size());
	}

	private List<Person> getPeople() {
		Person p1 = new Person("Fred", 32, "Barman");
		Person p2 = new Person("Dave", 45, "Carpenter");
		Person p3 = new Person("Sue", 42, "Hairdresser");
		return Arrays.asList(p1,p2,p3);
	}

}
