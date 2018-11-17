import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter number:");
		int userInput = input.nextInt();
		if (userInput > 0)
			System.out.println("Number is positive");
		if (userInput < 0)
			System.out.println("Number is negative");
		if (userInput == 0)
			System.out.println("Number is zero");
	}

}
