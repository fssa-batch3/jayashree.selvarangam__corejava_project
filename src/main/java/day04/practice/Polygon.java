package day04.practice;





public abstract class Polygon {
	protected int numberOfSides;
	
	public Polygon (int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		}
		else {
			this.numberOfSides = numberOfSides;
		}
	}
	
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
}


















































////public abstract class Polygon {
////
////	  abstract double area();
////
////	    double perimeter() {
////	        return 0;
////	    }
////}
////
////class Rectangle extends Polygon {
////    private double length;
////    private double width;
////
////    Rectangle(double length, double width) {
////        this.length = length;
////        this.width = width;
////    }
////
////    double area() {
////        return length * width;
////    }
////
////
////    double perimeter() {
////        return 2 * (length + width);
////    }
////
////   
////}
////
////class RightAngledTriangle extends Polygon {
////    private double base;
////    private double height;
////
////    RightAngledTriangle(double base, double height) {
////        this.base = base;
////        this.height = height;
////    }
////
////    double area() {
////        return 0.5 * base * height;
////    }
////
////    
////    double perimeter() {
////        double hypotenuse = Math.sqrt(base * base + height * height);
////        return base + height + hypotenuse;
////    }
////
////    
//}


