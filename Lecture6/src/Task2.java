import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int userInput = input.nextInt();
		for(int i = userInput;i>0;i--){
			System.out.println("i is: "+i);
		}
	}

}
