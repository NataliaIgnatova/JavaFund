import java.util.Scanner;

public class SecondTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter number:");
		int userInput = input.nextInt();
		System.out.println("Is even? " + (userInput % 2 == 0));

	}

}
