package design.principles.dependencyinversion.updated;

public class Phone implements Notifier{

	@Override
	public void alertWeatherConditions(String conditions) {
        if(conditions.equals("rainy")) {
            System.out.println("It is rainy");
        }
	}

}
