package design.principles.openclosed;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public double calculateArea() {
        return new OldAreaCalulator().calculateAreaRectangle(this);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}