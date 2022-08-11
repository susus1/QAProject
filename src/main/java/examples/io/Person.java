package examples.io;

public class Person {
	private String name;
	private int age;
	private String jobTitle;
	
	public Person(String name, int age, String jobTitle) {
		this.setName(name);
		this.setAge(age);
		this.setJobTitle(jobTitle);
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %d %s", name, age, jobTitle);
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
}
