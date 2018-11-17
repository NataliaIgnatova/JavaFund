import java.util.Scanner;

public class Factorial {
	static int n;
	public int Factorial(){
		int fact=1;
		for(int i =1 ;i<=n;i++){
			fact= fact*i;
		}
		return fact;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		n = in.nextInt();
		Factorial fact = new Factorial();
		int factorial = fact.Factorial();
		System.out.println("Factorial is: "+factorial);
	}

}
