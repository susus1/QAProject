package examples.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonBuilder {

	public static void main(String[] args) {
		Person p1 = new Person("Fred", 32, "Barman");
		Person p2 = new Person("Dave", 45, "Carpenter");
		Person p3 = new Person("Sue", 42, "Hairdresser");

		List<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);

		people.stream().forEach(p -> System.out.println(p));

//		String search = "Pete";
//		
//		people.parallelStream().filter(p -> p.getName().equalsIgnoreCase(search))
//		.findFirst()
//		.ifPresentOrElse(p -> System.out.println(p), ()->System.out.println("Not found"));
		
		
		
//		Optional<Person> optional = people.stream().filter(p -> p.getName().equalsIgnoreCase(search)).findFirst();
//		if (optional.isPresent()) {
//			System.out.println(optional.get());
//		} else {
//			System.out.println("not found");
//		}
		
		//Person person = people.stream().filter(p -> p.getName().equalsIgnoreCase(search)).findFirst().orElse(null);
		


	}

}
