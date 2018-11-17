import java.util.Scanner;

public class FirstTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double rand = Math.round(Math.random() * 10);
		//System.out.println(rand);
		int opit = 0;
		while (opit <= 2) {
			opit++;
			System.out.println("Enter your number:");
			double userInput = input.nextDouble();
			if (userInput == rand) {
				System.out.println("Won!");
				break;
			} else if (userInput > rand) {
				System.out.println("Number is smaller than your choice");
			} else if (userInput < rand) {
				System.out.println("Number is bigger than your choice");
			}
			if (opit == 3) {
				System.out.println("Your turn is over!");
			}
		}
		
	}

}
