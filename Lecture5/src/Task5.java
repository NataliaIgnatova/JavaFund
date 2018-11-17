import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a:");
		double a = input.nextDouble();
		System.out.println("Please enter b:");
		double b = input.nextDouble();
		System.out.println("Please enter c:");
		double c = input.nextDouble();
		if (a == b && b == c) {
			System.out.println("Триъгълника е равностранен!");
		} else if (a == b && a != c) {
			System.out.println("Триъгълника е равнобедрен!");
		} else if (a != b && b != c && a != c)
			System.out.println("Триъгълника е разностранен!");

	}

}
