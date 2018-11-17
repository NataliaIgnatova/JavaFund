import java.util.Scanner;

public class FourthTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = input.nextInt();
		int sum = 0;
		String userInput = String.valueOf(number);
		System.out.println("Is it palindrome: " + userInput.equals(new StringBuilder(userInput).reverse().toString()));
		while (number > 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		System.out.println("Sum of digits is: " + sum);

	}

}
