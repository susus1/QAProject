package console;

import examples.optional.Product;

public class Runner {

	public static void main(String[] args) {
		int a = 6;
		int b = 7;
		int c = 8;
		int i = ((a * b) / (c + 1)) - 5;
		int j = a * b / c + 1 - 5;
		System.out.println(i);
		System.out.println(j);
		
//		Product p = new Product("Dave");
//		p=null;
//		System.out.println(p.getName());
		
//		Object x = new Object();
//		if (x instanceof Product) {
//			Product a = (Product)x;
//		}

//		int[] numbers = new int[10];
//		
//		int index = 10;
//		if(index < numbers.length) {
//			int i = numbers[index];
//		}
//		else {
//			System.out.println("index out of range");
//		}

	}

}
