package design.patterns.strategy.exercise;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();
		context.setStrategy(new EnglishStrategy());
		System.out.println(context.translate());
	}

}
