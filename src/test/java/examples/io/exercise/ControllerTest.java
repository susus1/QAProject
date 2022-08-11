package examples.io.exercise;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ControllerTest {

	@Before
	public void setUp() {
		peopleRepository = new FileRepository();
	}
	
	private PeopleRepository peopleRepository;

	@Test
	public void test() {
		Controller controller = new Controller(peopleRepository);
		assertEquals(3, controller.selectAll().size());
	}

}
