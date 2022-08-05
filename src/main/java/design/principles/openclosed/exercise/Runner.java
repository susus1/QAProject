package design.principles.openclosed.exercise;

public class Runner {

	public static void main(String[] args) {
		
		Greeting greeting = new SpanishGreeting();
		Greeter greeter = new Greeter(greeting);
		System.out.println(greeter.greet());

	}

}
