import java.util.Scanner;

public class FirstTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter number:");
		int userInput = input.nextInt();
		int hours = userInput / 3600;
		int min = (userInput % 3600) / 60;
		int seconds = (userInput % 3600) - 60;
		System.out.println("It is " + hours + " hours " + min + " minutes " + seconds + " seconds");

	}

}
