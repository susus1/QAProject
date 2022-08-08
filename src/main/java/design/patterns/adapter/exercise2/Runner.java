package design.patterns.adapter.exercise2;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter();
		turkeyAdapter.fly();
		turkeyAdapter.quack();
		
	}

}
