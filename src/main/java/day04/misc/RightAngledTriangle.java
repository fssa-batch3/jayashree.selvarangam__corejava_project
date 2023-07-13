package day04.misc;

public class RightAngledTriangle extends Rectangle{
	protected double c;
	
	public RightAngledTriangle(double a, double b, double c) throws Exception {
		super(3, c);
		this.c = c;
	}
	@Override
	public double calculateArea() {
		 return super.calculateArea()/2;
	}
	
	public double calculatePerimeter() {
		   return  super.calculateArea()/2 + this.c;
	}
	
}