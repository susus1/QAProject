package design.principles.srp;

public class Car {
    private String colour;
    private String model;
    private int mileage;

    // constructor
    public Car(String colour, String model, int mileage) {
        this.setColour(colour);
        this.setModel(model);
        this.setMileage(mileage);
    }

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

    // getters and setters for colour, model, mileage
}
