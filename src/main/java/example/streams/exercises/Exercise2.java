package example.streams.exercises;

import java.util.Arrays;
import java.util.List;

public class Exercise2 {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(3, 4, 7, 8, 12);
		int total = number.stream().reduce((a, b)-> a*b).get();
		System.out.println(total);

	}

}
