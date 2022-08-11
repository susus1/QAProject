package examples.io.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import examples.io.Person;

public class ReadWritePerson {

	public static void main(String[] args) {
		Person p1 = new Person("Fred", 32, "Barman");
		Person p2 = new Person("Dave", 45, "Carpenter");
		Person p3 = new Person("Sue", 42, "Hairdresser");

		List<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);


		try {
			//writeToFile(people);
			List<Person> retrievedList = readFromFile();
			retrievedList.forEach(p->System.out.println(p));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
			



	}

	private static void writeToFile(List<Person> people) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/people.txt"))) {

			for (Person person : people) {
				String personString = String.format("%s,%d,%s%n", person.getName(), person.getAge(),
						person.getJobTitle());
				bw.write(personString);
			}
		}
	}

	private static List<Person> readFromFile() throws IOException {
		List<Person> people = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/people.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] attributes = line.split(",");
				Person person = new Person(attributes[0],Integer.parseInt(attributes[1]), attributes[2]);
				people.add(person);
			}
			return people;
		}
	}



}
