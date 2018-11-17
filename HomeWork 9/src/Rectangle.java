
public class Rectangle implements Shape,Comparable<Shape> {
	private double a;
	private double b;
	private ShapeType shapeType = ShapeType.RECTANGLE;
	
	public Rectangle(){}
	
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public ShapeType getShapeType(){
		return shapeType;
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(a+b);
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
