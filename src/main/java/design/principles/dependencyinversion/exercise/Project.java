package design.principles.dependencyinversion.exercise;

import java.util.ArrayList;
import java.util.List;

public class Project {
	
	private List<Developer> developers = new ArrayList<>();

	public Project() {
		developers.add(new FrontendDeveloper());
		developers.add(new BackendDeveloper());
	}

	public void implement() {
		for (Developer developer : developers) {
			developer.writeCode();
		}
	}
	
	
	

}
