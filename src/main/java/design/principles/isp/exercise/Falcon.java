package design.principles.isp.exercise;

public class Falcon implements Bird{
    private String currentLocation;
    private int numberOfEggs;

    public Falcon(int initialEggCount) {
        this.setNumberOfEggs(initialEggCount);
    }

    public void fly() {
        this.setCurrentLocation("soaring above the clouds");
    }

    public void layEggs() {
        this.setNumberOfEggs(getNumberOfEggs() + 1);
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
