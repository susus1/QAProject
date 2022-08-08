package design.patterns.strategy.exercise;

public class Context {
	private Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public String translate() {
		return strategy.speak();
	}
	

}
