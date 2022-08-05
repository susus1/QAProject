package design.principles.srp;

public class Driver {
    private Car car;

    // functionality
    public void drive(int milesDriven){
        car.setMileage(car.getMileage() + milesDriven);
    }
    
    public void checkTyrePressure() {
    	
    }


}
