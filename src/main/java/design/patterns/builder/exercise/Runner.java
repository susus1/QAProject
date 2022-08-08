package design.patterns.builder.exercise;

public class Runner {

	public static void main(String[] args) {
		BankAccount account = new BankAccount.Builder(12231333)
				.withOwner("Dave Dawson")
				.atBranch("Slough")
				.build();
		
		System.out.println(account.getOwner());

	}

}
