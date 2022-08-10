package examples.streams.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Exercise3 {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(3, 4, 7, 8, 12);
		int max = number.stream().mapToInt(i->i).max().getAsInt();
		System.out.println(max);
		
		int min = IntStream.of(3, 4, 7, 8, 12).min().getAsInt();
		System.out.println(min);
		
		IntStream.of(3, 4, 7, 8, 12).filter(i->i%2==0).forEach(i -> System.out.printf("%d ",i));
		
		System.out.println();
		
		IntStream.of(3, 4, 7, 8, 12).filter(i->i%2!=0).forEach(i -> System.out.printf("%d ",i));
		
		System.out.println();
		
		int sum = IntStream.of(3, 4, 7, 8, 12).sum();
		System.out.println(sum);
		
		int minVal = IntStream.of(3, 4, 7, 8, 12).map(i -> i*i).filter(i -> i%2 != 2).min().getAsInt();
		System.out.println(minVal);
	}

}
