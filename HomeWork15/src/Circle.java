
public class Circle implements Figure {
	private int radius;
	private final static double PI = 3.14;
	public Circle(){
		
	}
	
	public Circle(int radius){
		this.radius = radius;
	}
	
	@Override
	public double calcPerimeter() {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	public int getRadius(){
		return this.radius;
	}
	
	public String toString(){
		return "Perimeter is: "+this.calcPerimeter();
	}
	
}
