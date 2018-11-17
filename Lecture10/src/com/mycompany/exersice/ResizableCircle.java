package com.mycompany.exersice;

public class ResizableCircle extends Circle implements Resizable {

	
	public ResizableCircle(double radius){
		super(radius);
	}
	
	public double getArea(){
		return super.getArea();
	}
	
	public double getPerimeter(){
		return super.getPerimeter();
	}
	@Override
	public double resizePerimeter(int percent) {
		// TODO Auto-generated method stub
		return super.getPerimeter()*percent;
	}

	@Override
	public double resizeArea(int percent) {
		// TODO Auto-generated method stub
		return super.getArea()*percent;
	}

	@Override
	public String toString(){
		return "Radius is:" +super.getRadius()+", area is:"+this.getArea()+" ,perimeter is:"+this.getPerimeter();
	}
}
