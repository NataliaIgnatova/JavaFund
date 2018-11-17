import java.util.Scanner;

public class SecondTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter x1:");
		int firstNumber = input.nextInt();
		System.out.println("Please enter x2:");
		int secondNumber = input.nextInt();
		System.out.println("Please enter x3:");
		int thirdNumber = input.nextInt();
		double mu = (firstNumber + secondNumber + thirdNumber) / 3;
		double squareSigma = (Math.pow((firstNumber - mu), 2) + Math.pow((secondNumber - mu), 2)
				+ Math.pow((thirdNumber - mu), 2)) / 3;
		double sigma = Math.sqrt(squareSigma);
		System.out.println(mu);
		System.out.println(squareSigma);
		System.out.println(sigma);

	}

}
