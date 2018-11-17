import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int userIn =in.nextInt();
		for(int i=1;i<userIn;i+=2){
			System.out.println(i);
		}
	}

}
