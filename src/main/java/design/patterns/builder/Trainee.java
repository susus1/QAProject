package design.patterns.builder;

public class Trainee {
	private String name;
	private int age;
	private String technology;
	
	
	public Trainee(String name, int age, String technology) {
		this.name = name;
		this.age = age;
		this.technology = technology;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getTechnology() {
		return technology;
	}
	
	
	public static class TraineeBuilder {
		private String name;
		private int age;
		private String technology;
		
		public TraineeBuilder() {
			// TODO Auto-generated constructor stub
		}
		
		public Trainee buildTrainee() {
			return new Trainee(name, age, technology);
		}
		
		public TraineeBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public TraineeBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public TraineeBuilder technology(String technology) {
			this.technology = technology;
			return this;
		}
		
	}
}
