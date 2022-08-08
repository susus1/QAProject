package design.patterns.builder;

public class Runner {

	public static void main(String[] args) {

		Trainee t1 = new Trainee.TraineeBuilder().name("Dave").buildTrainee();
		
		Trainee t2 = new Trainee.TraineeBuilder().name("Sue").age(45).technology("Java").buildTrainee();

	}

}
