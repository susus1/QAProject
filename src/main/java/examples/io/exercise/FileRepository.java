package examples.io.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import examples.io.Person;

public class FileRepository implements PeopleRepository {

	@Override
	public List<Person> readPeople() {
		List<Person> people = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/people.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] attributes = line.split(",");
				Person person = new Person(attributes[0],Integer.parseInt(attributes[1]), attributes[2]);
				people.add(person);
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		return people;
	}

}
