
public class FirstTask {

	public static void main(String[] args) {
		int a = 5;
		int b = 12;
		int c = 7;
		int d = 20;
		System.out.println("a = " + a + "," +"b = "+ b + "," + "c = "+ c + ","+"d = " + d);
		int swap;
		swap = a;
		a = d;
		d = swap;
		swap = b;
		b = c;
		c = swap;
		System.out.println("a = " + a + "," +"b = "+ b + "," + "c = "+ c + ","+"d = " + d);

	}

}
