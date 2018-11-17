
public class HomeWork {

	public static void main(String[] args) {

		// task 1
		int a = 5;
		int b = 12;
		int c = 7;
		int d = 20;
		int swap;
		swap = a;
		a = d;
		d = swap;
		swap = b;
		b = c;
		c = swap;
		System.out.println(a + "," + b + "," + c + "," + d);

		// task 2
		String firstName = "\"Stefan\"";
		String secondName = "\"Ivanov\"";
		System.out.println(firstName + "\n" + secondName);
		// task 3
		int twentyfive = 25;
		System.out.println(Integer.parseInt(Integer.toBinaryString(25)));
		System.out.println(Integer.parseInt(Integer.toHexString(25),16));
		
		int t = 128;
		short t2 = (short) t;
		byte t1 = (byte) t;
		System.out.println(t1);
	}

}
