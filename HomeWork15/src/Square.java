
public class Square implements Figure {

	private int x;
	private int y;
	
	public Square(){
		
	}
	
	public Square(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public double calcPerimeter() {
		// TODO Auto-generated method stub
		return 2*(x+y);
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getX(){
		return this.x;
	}

	public void setY(int y){
		this.y = y;
	}
	
	public int getY(){
		return this.y;
	}
	
	public String toString(){
		return "Perimeter is: "+this.calcPerimeter();
	}
}
