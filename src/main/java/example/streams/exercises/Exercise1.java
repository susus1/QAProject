package example.streams.exercises;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		names.stream().map(name->"Hello "+name).forEach(s->System.out.println(s));

	}

}
