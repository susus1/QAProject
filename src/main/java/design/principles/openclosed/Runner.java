package design.principles.openclosed;

public class Runner {

	public static void main(String[] args) {
		AreaCalculator calculator = new AreaCalculator();
		Circle circle = new Circle();
		circle.setRadius(5);
		double circleArea = calculator.calculateShapeArea(circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(5);
		rectangle.setWidth(10);
	 	double rectanglArea = calculator.calculateShapeArea(rectangle);
	 	
	 	System.out.println(circleArea);
	 	System.out.println(rectanglArea);

	}

}
