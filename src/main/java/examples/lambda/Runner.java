package examples.lambda;

public class Runner {

	public static void main(String[] args) {
		
		FuncInterface func = f -> (f-32)*5/9;
		double c = func.convert(100);
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		// build an instance of a class that implements the Runnable interface
		Runnable r1 = new RunnableExample();

		// instantiate an anonymous class
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("anonymous inner class");
			}
		};

		// lambda expression
		Runnable r3 = () -> {
			System.out.println("lamda expression");
		};

//		r1.run();
//		r2.run();
//		r3.run();

	}

}
