import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter first number: ");
		double firstNumber = input.nextDouble();
		System.out.println("Please, enter second number: ");
		double secondNumber = input.nextDouble();
		System.out.println("Please, enter op(+, -, *, /, %): ");
		String op = input.next();
		if (op.equals("+")) {
			double sum = firstNumber + secondNumber;
			System.out.println("Result of op is: " + sum);
		} else if (op.equals("-")) {
			double minus = firstNumber - secondNumber;
			System.out.println("Result of op is: " + minus);
		} else if (op.equals("*")) {
			double mult = firstNumber * secondNumber;
			System.out.println("Result of op is: " + mult);
		} else if (op.equals("/")) {
			double div = firstNumber / secondNumber;
			System.out.println("Result of op is: " + div);
		} else if (op.equals("%")) {
			double res = firstNumber % secondNumber;
			System.out.println("Result of op is: " + res);
		}

	}

}
