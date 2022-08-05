package design.principles.dependencyinversion.updated;

public class Runner {

	public static void main(String[] args) {
		WeatherTracker tracker = new WeatherTracker();
		tracker.setConditions("rainy");
		Notifier email = new Email();		
		tracker.notify(email);

	}

}
