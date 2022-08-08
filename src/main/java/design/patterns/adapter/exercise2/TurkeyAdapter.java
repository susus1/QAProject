package design.patterns.adapter.exercise2;

public class TurkeyAdapter implements Duck {
	
	private Turkey turkey = new WildTurkey();

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		turkey.fly();
	}

}
