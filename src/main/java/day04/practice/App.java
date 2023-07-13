package day04.practice;

public class App {
	   public static void main(String[] args) throws Exception {
	        RightAngledTriangle triangle = new RightAngledTriangle(7.0d, 8.0d, 9.0d);
	        System.out.println("Area: " + triangle.calculateArea());
	        System.out.println("Perimeter: " + triangle.calculatePerimeter());
	        
	        
	        Rectangle rectangle = new Rectangle(5, 10);
	        System.out.println("Area: " + rectangle.calculateArea());
	        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
	       
	        
	    }
}
