package examples.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		HashSet<Product> products = new HashSet<>();

		
		Product p1 = new Product();
		p1.setId(1L);
		p1.setName("Bread");
		
		
		Product p2 = new Product();
		p2.setId(2L);
		p2.setName("Cheese");;
		
		products.add(p1);
		products.add(p2);
				
		Product p3 = new Product();
		p3.setId(1L);
		p3.setName("Bread");
		products.remove(p3);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println(p1.equals(p3));
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
	


		
	
		
	}

}
