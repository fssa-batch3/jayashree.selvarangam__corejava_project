package day02.solved;


class ShapeCalculator {

	public double calculateArea(double radius) {
		return Math.PI * radius * radius;
	}

	public double calculateArea(double length, double width) {
		return length * width;
	}
}


public class Main {

	public static void main(String[] args) {

		ShapeCalculator calculator = new ShapeCalculator();
		double circleArea = calculator.calculateArea(2.3); 
		double rectangleArea = calculator.calculateArea(4.2, 8.8); 
		
		System.out.println(circleArea);
		System.out.println(rectangleArea);

	}
	
}
