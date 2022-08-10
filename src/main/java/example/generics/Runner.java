package example.generics;

import java.util.ArrayList;
import java.util.List;

import design.patterns.adapter.Product;

public class Runner {

	public static void main(String[] args) {


		Cage<Animal> cage = new Cage<>();
		
		List<Animal> list = new ArrayList<>();
		list.add(new Tiger());
		list.add(new Elephant());
		
		cage.add(list );
		
		
		LowerBoundCage lowerBoundCage = new LowerBoundCage();
		lowerBoundCage.add(list);
	}

}
