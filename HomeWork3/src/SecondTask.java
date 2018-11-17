import java.util.Scanner;

public class SecondTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double weight;
		double inches;
		System.out.println("Please enter your weight(pounds): ");
		weight = input.nextDouble();
		System.out.println("Please enter your height(inches): ");
		inches = input.nextDouble();
		double result = (weight*0.45359237)/(inches * 0.0254 * inches * 0.0254);
		System.out.println("Body Mass Index is: " + result);
	} 

}
