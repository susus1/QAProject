package example.generics;

import java.util.ArrayList;

import design.patterns.adapter.Product;

public class Runner {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Monday");
		//arrayList.add(new Product());
		
		String day = (String) arrayList.get(1);
		System.out.println(day);

	}

}
