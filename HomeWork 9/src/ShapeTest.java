
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle= new Circle(5);
		Shape circle2= new Circle(8);
		Shape rectangle2 = new Rectangle(2,6);
		Shape rectangle = new Rectangle(8,3);
		circle.getPerimeter();
		circle.getArea();
		circle2.getPerimeter();
		circle2.getArea();
		rectangle2.getPerimeter();
		rectangle2.getArea();
		rectangle.getPerimeter();
		rectangle.getArea();
		
		Shape[] shapes=new Shape[]{circle,rectangle,circle2,rectangle2};
		System.out.println(java.util.Arrays.toString(shapes));
		java.util.Arrays.sort(shapes);
		System.out.println(java.util.Arrays.toString(shapes));
	}

}
