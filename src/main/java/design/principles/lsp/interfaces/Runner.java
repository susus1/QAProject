package design.principles.lsp.interfaces;

public class Runner {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Owl owl = new Owl();
		animal.learnToFly(owl);

	}

}
