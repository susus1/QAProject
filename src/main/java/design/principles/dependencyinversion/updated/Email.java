package design.principles.dependencyinversion.updated;

public class Email implements Notifier {

	@Override
	public void alertWeatherConditions(String conditions) {
        if (conditions.equals("sunny")) {
            System.out.println("It is sunny");
        }
		
	}

}
