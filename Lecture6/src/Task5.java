import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int userIn = in.nextInt();
		for(int i=1; i<userIn;i++){
			if(i%2==0){
				continue;
			}else{
				System.out.println(i);
			}
		}
	}

}
