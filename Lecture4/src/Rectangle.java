import java.util.Scanner;

public class Rectangle {
	
	static double a;
	static double b;
	
	public Rectangle(double a,double b){
		a = this.a;
		b = this.b;
	}
	public static double getArea(){
		return a * b;
	}

	public static double getPerimeter(){
		return 2*(a + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter a: ");
		a = input.nextDouble();
		System.out.println("Please, enter b: ");
		b = input.nextDouble();
		Rectangle rect= new Rectangle(a,b);
		/*double perimeter = 2 * (a + b);
		double area = a * b;*/
		System.out.println("Perimeter is: " + rect.getPerimeter());
		System.out.println("Area is: " + rect.getArea());

	}

}
