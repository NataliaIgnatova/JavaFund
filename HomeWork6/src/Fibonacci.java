import java.util.Scanner;

public class Fibonacci {
	static int n;
	public static int fibonacci(int n){
		if(n<=1){
			return n;
		}else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		n= in.nextInt();
		for(int i=0;i<=n;i++){
			System.out.println("Fibonacci is: "+fibonacci(i));
		}

	}

}
