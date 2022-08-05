package design.principles.openclosed;

public class OldAreaCalulator {
    public double calculateAreaRectangle(Rectangle rect){
        return rect.getLength() * rect.getWidth();
    }
    public double calculateAreaCircle(Circle circle){
        return circle.getRadius() * circle.getRadius() * Math.PI;
    }
}
