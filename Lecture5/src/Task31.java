import java.util.Scanner;

public class Task31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter hour:");
		int userInput = input.nextInt();
		if (userInput <= 10) {
			System.out.println("добро утро!");
		} else {
			if (userInput <= 18) {
				System.out.println("добър ден!");
			} else {
				if (userInput <= 24) {

					System.out.println("добър вечер!");
				}
			}
		}
	}

}
