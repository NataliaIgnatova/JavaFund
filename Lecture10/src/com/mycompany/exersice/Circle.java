package com.mycompany.exersice;

public class Circle implements GeometricObject{
	private double radius = 1;
	private final double PI = 3.14;

	public Circle(double radius){
		this.radius = radius;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getPI() {
		return PI;
	}
	@Override
	public String toString(){
		return "Radius is:" +this.radius+", area is:"+this.getArea()+" ,perimeter is:"+this.getPerimeter();
	}
	
}
