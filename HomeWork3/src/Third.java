import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter");
		double num = input.nextDouble();
		double min = num;
		while (input.hasNextDouble()) {
			num = input.nextDouble();
			if (num < min) {
				min = num;
			}
		}
		System.out.println(min);

	}

}
