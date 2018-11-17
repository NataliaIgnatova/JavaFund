import java.util.Scanner;

public class ThirdTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter number:");
		int userInput = input.nextInt();
		System.out.println("?" + (userInput % 3 == 0 && userInput % 5 == 0));

	}

}
