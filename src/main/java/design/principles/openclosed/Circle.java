package design.principles.openclosed;

public class Circle implements Shape {
    private double radius;

    public double calculateArea() {
        return new OldAreaCalulator().calculateAreaCircle(this);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}