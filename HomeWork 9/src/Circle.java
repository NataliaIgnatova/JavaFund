import java.util.Comparator;

public class Circle implements Shape,Comparable<Shape> {

	private final double PI = 3.14;
	private double radius;
	private ShapeType shapeType = ShapeType.CIRCLE;
	public Circle() {
	}

	public Circle(double rad) {
		this.radius = rad;
	}

	public ShapeType getShapeType(){
		return shapeType;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub

		return PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * PI * radius;
	}

	@Override
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
		return this.getPerimeter()>o.getPerimeter()?1:this.getPerimeter()<o.getPerimeter()?-1:0;
	}

	@Override 
	public String toString(){
		return shapeType+" perimeter is: "+this.getPerimeter();
	}



}
