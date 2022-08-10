package examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Runner {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2,3,4,5);

		
//		int total = number.stream().filter(i->i%2==0).reduce((a,b) -> a+b).get();
//		System.out.println(total);
		
	    List<String> names = Arrays.asList("Bob", "Trevor", "Steve", "Gary");
//	    names.stream().map(s -> s.toUpperCase()).forEach(x -> System.out.println(x));
	    
	    //Predicate<String> predicate = s -> s.contains("e");
	    
		List<String> capitalisedNames = names
	    		.stream()
	    		.filter(s -> s.contains("e") )
	    		.map(s->s.toUpperCase())
	    		.sorted()
	    		.collect(Collectors.toList());
	     
//	    for (String name : capitalisedNames) {
//			System.out.println(name);
//		}
		

		double avg = DoubleStream.of(5,10,15).average().getAsDouble();
		System.out.println(avg);
		
		double max = DoubleStream.of(5,10,15).max().getAsDouble();
	    System.out.println(max);
	}

}
