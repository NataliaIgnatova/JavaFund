import java.util.Scanner;

public class BodyMassIndexKgM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double weight;
		double meter;
		System.out.println("Please enter your weight(kg): ");
		weight = input.nextDouble();
		System.out.println("Please enter your height(meter): ");
		meter = input.nextDouble();
		double result = weight/meter*meter;
		System.out.println("Body Mass Index is: " + result);
	}

}
