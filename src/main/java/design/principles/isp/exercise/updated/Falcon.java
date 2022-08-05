package design.principles.isp.exercise.updated;

public class Falcon implements NonExtinctBird {

    private String currentLocation;
    private int numberOfEggs;
    
    
  
	public Falcon(int numberOfEggs) {
		this.numberOfEggs = numberOfEggs;
	}

	@Override
	public void layEggs() {
		this.setNumberOfEggs(getNumberOfEggs() + 1);
		
	}

	@Override
	public void fly() {
		this.setCurrentLocation("soaring above the clouds");
		
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public int getNumberOfEggs() {
		return numberOfEggs;
	}

	public void setNumberOfEggs(int numberOfEggs) {
		this.numberOfEggs = numberOfEggs;
	}

}
